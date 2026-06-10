class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int n=nums.length;
        int[] res=new int[n];
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int leftsum=0;
        for(int i=0; i<n; i++){
            int rightsum= totalsum-leftsum-nums[i];
            int left= nums[i]*i-leftsum;
            int right=rightsum-nums[i]*(n-1-i);
            res[i]=left + right;
            leftsum+=nums[i];
        }
        return res;
    }
}