class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m=flowerbed.length;
        int maxc=0;
        if(n==0){
            return true;
        }
        for(int i=0; i<m; i++){  
            if(flowerbed[i]==0){         
            boolean emptyl=(i==0|| flowerbed[i-1]==0);
            boolean emptyr=(i==m-1|| flowerbed[i+1]==0);
            if(emptyl && emptyr){
                flowerbed[i]=1;
                maxc++;
                if(maxc>=n){
                    return true;
                }
            }
            }
           
        }
        return false;
    }
}