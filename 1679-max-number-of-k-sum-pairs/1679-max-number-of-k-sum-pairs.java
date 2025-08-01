class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
      int i=0;
      int j=nums.length-1;  
      while(i<j){
        if(nums[i]+nums[j]==k){
            count++;
            i++;
            j--;
            continue;

        }
        if(k>nums[j]+nums[i]){
            i++;
        }
      else{
        j--;
      }
      }
      return count;

    }
}