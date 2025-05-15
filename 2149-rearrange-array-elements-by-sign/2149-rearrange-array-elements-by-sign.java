class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int[] pos= new int[n/2];
        int [] neg= new int[n/2];
        int l=0;
        int m=0;
        for(int i=0; i<n; i++){
            if(nums[i]<0){
                neg[l]=nums[i];
                l++;
            }
            else{
                pos[m]=nums[i];
                m++;
            }
        }
        int j=0;
        for(int i=0; i<n; i+=2){
           nums[i]=pos[j];
           j++;
        }
        int k=0;
        for(int i=1; i<n; i+=2){
            nums[i]=neg[k];
            k++;
        }
        return nums;
    }
}