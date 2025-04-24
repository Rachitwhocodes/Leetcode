class Solution {
    public boolean isHappy(int n) {
           int count = 0; 
         while (n != 1 && count < 1000) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
            count++;
        }
     return n == 1;
    }
}