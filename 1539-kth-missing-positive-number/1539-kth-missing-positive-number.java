class Solution {
    public int findKthPositive(int[] arr, int k) {
      int n=arr.length;
    //   int z= arr[arr.length-1];
      ArrayList<Integer> a=new ArrayList<>();
      for(int i=1; i<=10000; i++){
        int count=0;
        for(int j=0; j<n; j++){
            if(arr[j]== i){
                count=1;
                 
            }
        }
        if(count==0){
            a.add(i);
        }
        
      }  
      System.out.print(a);
      return a.get(k-1);
    }
}