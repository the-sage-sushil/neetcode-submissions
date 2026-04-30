class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];

            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder keyb = new StringBuilder();

            for(int num : count){
                keyb.append('#').append(num);
            }

            String key = keyb.toString();

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
            

        }
        

        return new ArrayList<>(map.values());

    }
}
