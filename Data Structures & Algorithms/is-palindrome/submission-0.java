class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]","").replace(" ","")
            .trim().toLowerCase();
        char[] charSeq = newString.toCharArray();

        int left = 0;
        int right = charSeq.length - 1;

        while (left <= right){
            if(charSeq[left] != charSeq[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
