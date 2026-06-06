class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        String t = new StringBuilder(s).reverse().toString();

        return s.equals(t);
    }
}