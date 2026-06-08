class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < order.length()) {
            int j = 0;

            while (j < s.length()) {
                if (order.charAt(i) == s.charAt(j)) {
                    sb.append(order.charAt(i));
                }
                j++;
            }

            i++;
        }


        String s2= sb.toString();
        StringBuilder extra=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(s2.indexOf(ch)==-1){
                extra.append(ch);
            }
        }
          s2+=extra.toString();
          return s2;
    }
}