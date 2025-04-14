class Solution {
    public String reverseStr(String s, int k) {
     
   char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, a.length - 1);

            // Reverse characters from start to end
            while (start < end) {
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }

        return new String(a);
 
    }
}