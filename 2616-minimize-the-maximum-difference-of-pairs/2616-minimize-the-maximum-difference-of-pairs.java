class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low=0;
        int high=nums[nums.length-1]-nums[0];
        while(low<high){
        int mid=low+(high-low)/2;
        int pairs=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]<=mid){
                pairs++;
                i++;
            }
        }
        if(pairs>=p){
            high=mid;
        }
        else{
            low=mid+1;
        }
        }
        return low;
    }
}