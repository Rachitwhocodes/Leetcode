class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      HashMap<Integer, Integer> ht = new HashMap<>();
      ArrayList <Integer> res=new ArrayList <>(); 
      int n=arr.length;
      for(int i=0; i<n; i++){
        int num=arr[i];
        ht.put(num, ht.getOrDefault(num,0)+1);
      }
         res.addAll(ht.values());

     HashSet<Integer> c=new HashSet<>(res);
     if(c.size()!=res.size()){
        return false; 
     }
      return true;
    }
}