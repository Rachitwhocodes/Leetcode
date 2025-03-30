class Solution {
    public String reverseWords(String s) {
        String s1="";
        String [] a=s.split(" ");
        for(int i=0; i<a.length;i++){
            String s2="";
            s2+=a[i];
            char[] b=s2.toCharArray();
            for(int j=b.length-1; j>=0; j--){
                s1+=b[j];
            }
            if(i>=0) s1+=" ";
        
        }
        return s1;
        
    }
}