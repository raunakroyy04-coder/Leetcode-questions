class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters required from t
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;

        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // Character is needed
            if (map.containsKey(ch)) {

                if (map.get(ch) > 0) {
                    count--;
                }

                map.put(ch, map.get(ch) - 1);
            }

            right++;

            // We have all required characters
            while (count == 0) {

                // Update minimum window
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    // Character became missing
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}