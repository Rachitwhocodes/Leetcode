class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int n=nums.length;
       int closesum= nums[0]+nums[1]+nums[2];
       for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
              while(left<right){
                int cusum=nums[i]+nums[left]+nums[right];
                   
                   if(Math.abs(cusum-target)< Math.abs(closesum-target)){
                     closesum=cusum;
                 }
                 if(cusum>target){
                    right--;
                 }
                 else left++;
            }
        }

        
        return closesum;
       
    }
}