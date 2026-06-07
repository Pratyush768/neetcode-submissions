class Solution {
    public boolean wordPattern(String pattern, String s) {
         
        String[] arr = s.split(" ");
         if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character,String>hs=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String st=arr[i];
            if(hs.containsKey(c)){
                if(!hs.get(c).equals(st)){
                    return false;
                }
            }else{
                if(hs.containsValue(st)){
               return false;
                }
                hs.put(c,st);
            }
        }
        return true;
    }
}