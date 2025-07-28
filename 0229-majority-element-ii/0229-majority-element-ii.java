class Solution {
    public List<Integer> majorityElement(int[] nums) {
    //    ArrayList<Integer> res=new ArrayList<Integer>();
    //     int n=nums.length;
    //     int count=1;
    //     Arrays.sort(nums);
    //     for(int i=1; i<n; i++){
    //         if(nums[i]==nums[i-1]){
    //             count++;
    //         }
    //         else{
    //             count=1;
    //         }
    //         if(count>n/3){
    //            if(!res.contains(nums[i])){
                   
    //             res.add(nums[i]);
                   
    //            }
    //         }
    //     }
    //     return res;
       ArrayList<Integer> res = new ArrayList<>();
        int n = nums.length;

        if (n == 0) return res;

        Arrays.sort(nums);
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    res.add(nums[i - 1]);
                }
                count = 1; 
            }
        }
        if (count > n / 3) {
            res.add(nums[n - 1]);
        }
        return res;

    }
}