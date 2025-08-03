class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxc=0;
        int left=0;
        int zero=0;
        for(int right=0; right<n; right++){
           if(nums[right]==0){
            zero++;
            while(zero>1){
               if(nums[left]==0){
                  zero--;
               } 
               left++;
               }
           
            }
            maxc=Math.max(maxc,right-left);
        }
        return maxc;
    }
}