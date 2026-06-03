class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>>mp=new HashMap<>();
        for(String s:strs){
            char[]c=s.toCharArray();
            Arrays.sort(c);
            String so=new String(c);
            if(!mp.containsKey(so)){
                mp.put(so,new ArrayList<>());

            }
            mp.get(so).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}