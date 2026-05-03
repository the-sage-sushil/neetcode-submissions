class Solution {
    public int longestConsecutive(int[] nums) {
        
        // 2 20 4 10 3 4 5
        // 4 2 3 5 20 4 10 5
        // 
        // 2

        int maxConsicative = 0;


        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }


        for(int num : nums){
            
            if(!set.contains(num - 1)){
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                maxConsicative = Math.max(maxConsicative,length);
            }
        }
        return maxConsicative;

    }
}
