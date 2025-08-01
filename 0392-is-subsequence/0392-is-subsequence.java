class Solution {
    public boolean isSubsequence(String s, String t) {
    int i=0;
    int k=0;
    char[] a=s.toCharArray();
    char[] b=t.toCharArray();
    ArrayList <Character> res= new ArrayList<>();
    while(i<a.length){
        while(k<b.length){
            if(a[i]==b[k]){
               res.add(a[i]);
                k++;
                break;
            }
            k++;
        }
        i++;
    }
    if(a.length==res.size()){
        return true;
    }
    return false;
    }
}