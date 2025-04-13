class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i = m - 1;         // pointer for nums1's last valid element
    int j = n - 1;         // pointer for nums2's last element
    int k = m + n - 1;     // pointer for the end of nums1 array

    // Merge from back to front
    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }

    // If nums2 has remaining elements
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
    }
}