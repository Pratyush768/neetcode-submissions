class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] res = new int[queries.length];
        int[] check = new int[words.length];
        int c = 0;
        for ( int i = 0; i < words.length; i++ ) {
            String s = words[i];
            if ( isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1)) ) {
                c++;
            }
            check[i] = c;
        }

        for (int i=0; i<queries.length; i++) {
            if ( queries[i][0] == 0 ) res[i] = check[queries[i][1]];
            else res[i] = check[queries[i][1]] - check[queries[i][0]-1];
        }
        return res;
    }

    static boolean isVowel( char ch ) {
        if ( ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ) return true;
        return false;
    } 
}