class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low=0;
        int high=numbers.length-1;
        int [] a=new int[2];
        while(low<high){
           if(numbers[low]+numbers[high]== target){
            a[0]=low+1;
            a[1]=high+1;
           }
           if(numbers[low]+numbers[high]>target){
            high--;
           }
           else{
            low++;
           }
        }
        return a;
    }
}