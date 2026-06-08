class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int count = 0;

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                String s = words[j];

                if (isVowel(s.charAt(0)) &&
                    isVowel(s.charAt(s.length() - 1))) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}