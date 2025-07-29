class Solution {
    public String mergeAlternately(String word1, String word2) {
        char [] c1=word1.toCharArray();
        char [] c2=word2.toCharArray();
        int k=0;
      
        char[] res= new char[c1.length+c2.length];
        int minlen= Math.min(c1.length,c2.length);
        for(int i=0; i<minlen; i++){
            res[k++]=c1[i];
            res[k++]=c2[i];
        }
        for(int i=minlen; i<c1.length; i++){
            res[k++]=c1[i];
        }
         for(int i=minlen; i<c2.length; i++){
            res[k++]=c2[i];
        }
    
       return new String(res);
    }
}