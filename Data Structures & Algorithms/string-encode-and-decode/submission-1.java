class Solution {

    public String encode(List<String> strs) {
        StringBuilder builderString = new StringBuilder();
        for(String str : strs){
            builderString.append(str.length()).append("#").append(str);
        }
        

        return builderString.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j)!= '#'){
                j++;
            }
            int stringLength = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + stringLength;

            result.add(str.substring(i,j));
            i = j;
        }
        return result;
    }
}
