class Solution {
    public int longestConsecutive(int[] nums) {
       Arrays.sort(nums);
        int n=nums.length;
        // int maxc =0;              
        // for(int i=0; i<n; i++){
        //     int num=nums[i];
        //     int count=1; 
        //     for(int k=0; k<n-1; k++){
        //         int next=num+1;
        //         int found=0;
            
        //  for(int j=0; j<n; j++){
        //     if(nums[j]==num+1){
        //       num=num+1;
        //       count++;
        //       found=1;
        //       break;
        //     }
        //  }
        //     if(found==0){
        //         break;
        //     }
         
        //     }
        //  if(count>maxc){
        //     maxc=count;
        //  }
            
        // }
        // return maxc;
       if(n==0){
        return 0;
       } 
       int count=1;
       int maxlen=1;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                count++;
            }
            else {
            count=1;
            }
            maxlen=Math.max(count,maxlen);
        }
        return maxlen;

    }
}