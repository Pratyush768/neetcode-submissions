class Solution {
    public int scoreOfString(String s) {
        int count=0;
        int i=0;
        int j=1;
        while(i<s.length() && j<s.length()){
            count+=Math.abs(s.charAt(i)-s.charAt(j));
            i++;
            j++;
        }
        return count;
    }
}