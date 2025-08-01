class Solution {
    public int maxArea(int[] height) {
      int n=height.length;
  int left=0;
  int right=n-1;
  int res=0;
  while(left<right){
    int h=Math.min(height[left],height[right]);
    int b=right-left;
    int ans=b*h;
    res=Math.max(ans,res);
    if(height[left]<height[right]){
        left++;
    }
    else{
        right--;
    }
  }
  return res;
    }
}