class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int s=Integer.MAX_VALUE;
        int sg=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
          if(nums[i]<=s){
            s=nums[i];
           }
          else if(nums[i]<=sg){
            sg=nums[i];
             }
          else{
            return true;
              }
        }
        return false;      

    }
}