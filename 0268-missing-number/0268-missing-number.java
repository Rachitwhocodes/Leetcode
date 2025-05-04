class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // for(int i=0; i<=n+1; i++){
        //     int flag=0;
        //     for(int j=0; j<n; j++){
        //         if(nums[j]==i){
        //             flag=1;
        //             break;
        //         }
        //     }
        //     if(flag==0){
        //         return i;
        //     }
        // }
        // return -1;
        int xor1=0;
        int xor2=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            xor1=xor1^i;
            xor2=xor2^nums[i];
        }
        xor1=xor1^n;
        return xor1^xor2;
    }
}