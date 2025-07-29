class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=candies[0];
        for(int i=1; i<n; i++){
           if(candies[i]>=candies[i-1]&& candies[i]>max){
            max=candies[i];
           }
        }
        ArrayList<Boolean> res= new ArrayList<Boolean>();
        for(int i=0; i<n; i++){
            int m=candies[i];
            m=m+extraCandies;
            if(m>=max){
                res.add(true);
            }
            else res.add(false);
        }
        System.out.println(max);
        return res;
    }
}