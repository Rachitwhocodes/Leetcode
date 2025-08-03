class Solution {
    public int largestAltitude(int[] gain) {
        int [] a=new int[gain.length+1];
       a[0]=0;
       int sum=0;
       for(int i=0; i<gain.length; i++){
           sum+=gain[i];
         a[i+1]=sum;
       }
       int max=0;
       for(int i=0; i<a.length; i++){
        max=Math.max(max,a[i]);
       }
      
       return max;
    }
}