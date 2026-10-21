
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] last = new int[26];
        boolean[] used = new boolean[26];
        char[] stack = new char[s.length()];
        int top = -1;

        // Store the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Skip duplicate characters
            if (used[c - 'a']) {
                continue;
            }

            // Remove larger characters if they appear later
            while (top >= 0
                    && stack[top] > c
                    && last[stack[top] - 'a'] > i) {
                used[stack[top] - 'a'] = false;
                top--;
            }

            stack[++top] = c;
            used[c - 'a'] = true;
        }

        return new String(stack, 0, top + 1);
    }
}
