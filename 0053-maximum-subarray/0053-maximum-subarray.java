class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        // long max=Integer.MIN_VALUE;;
        // for(int i=0; i<n; i++){
        //     long sum=0;
        //     for(int j=i; j<n; j++){
        //         sum+= nums[j];
        //         if(sum>max){
        //             max=sum;
        //         }
        //     }
        // }
        // return (int)max;
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0; i<n; i++){
           sum+=nums[i];
           if(sum<0){
            sum=0;
           }
            if(sum>max){
                max=sum;
            }
        }
        return (int)max;
    }
}