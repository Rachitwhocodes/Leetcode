class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> s= new TreeSet<>();
       for(int i=0; i<nums.length; i++){
        s.add(nums[i]);
       }
       int i = 0;
        for (int val : s) {
            nums[i++] = val; 
        }
          return s.size();
    }
}