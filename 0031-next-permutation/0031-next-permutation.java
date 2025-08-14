class Solution {
    public void nextPermutation(int[] nums) {
       int n=nums.length;
       int index=-1;
       for(int i=n-2; i>=0; i--){
        if(nums[i]<nums[i+1]){
        index=i;
        break;
        }
       } 
       if(index==-1){
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
       
        return;
       }
       for(int i=n-1; i>index; i--){
        if(nums[i]>nums[index]){
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            break;
        }
       }
       int from=index+1;
       int to =n-1;
       while(from<to){
        int temp=nums[from];
        nums[from]=nums[to];
        nums[to]=temp;
        from++;
        to--;
       }
    }
}