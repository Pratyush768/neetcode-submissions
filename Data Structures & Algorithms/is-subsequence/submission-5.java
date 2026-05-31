class Solution {
    public boolean isSubsequence(String s, String t) {
             StringBuilder sb=new StringBuilder();
             int j=0;
             int i=0;
             if(s.isEmpty()){
                return true;
             }
             if(t.isEmpty()){

                return false;
             
             }
             while(i<s.length() &&  j<t.length()){
                if(s.charAt(i)!=t.charAt(j)){

                    j++;
                }else{
                    sb.append(s.charAt(i));
                    i++;
                    j++;
                }
             }
               
             String str=sb.toString();
             if(s.equals(str)){
                return true;
             }else{
                return false;
             }
        }
}