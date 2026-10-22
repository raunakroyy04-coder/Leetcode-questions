class Solution {
    public int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        // Split by spaces
        String[] words = s.split(" ");
        // Return length of last word
        return words[words.length - 1].length();
    }
}