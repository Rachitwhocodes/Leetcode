class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        List<String> newArr=new ArrayList<>();
        for(String it: arr)
        if(it.length()!=0)
        newArr.add(it);
        StringBuilder st=new StringBuilder();
        for(int i=newArr.size()-1; i>=0;i--){
            st.append(newArr.get(i));
            if(i!=0)
            st.append(" ");
        }
        return st.toString();
    }
}