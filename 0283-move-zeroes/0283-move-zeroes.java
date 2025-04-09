class Solution {
    public void moveZeroes(int[] nums) {
        int numindex=0;
        for(int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                nums[numindex]=nums[i];
                numindex++;
            }
        }
        while(numindex<nums.length){
            nums[numindex]=0;
            numindex++;
        }

    }
}