class Solution {
    public int minimizeXor(int num1, int num2) {
        int bits=Integer.bitCount(num2);
        int ans=0;

        for(int i=31; i>=0 && bits>0; i--){
            if((num1 & (1<<i)) !=0){
                ans|=(1<<i);
                bits--;
            }
        }
        for(int i=0; i<=31 && bits>0; i++){
            if((num1 & (1<<i)) ==0){
                ans |=(1<<i);
                bits--;
            }
        }
        return ans;
    }
}