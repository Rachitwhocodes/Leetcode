class Solution {
public int stoneGameVI(int[] aliceValues, int[] bobValues) {
    int n=aliceValues.length;
    int[][] stones=new int[n][2];
    for(int i=0; i<n; i++){
        stones[i][0]= aliceValues[i]+bobValues[i];
        stones[i][1]=i;
    }
    Arrays.sort(stones,(a,b) -> b[0]-a[0]);
    int alice=0;
    int bob=0;
    for(int i=0; i<n; i++){
        int idx=stones[i][1];
        if(i%2==0){
            alice+=aliceValues[idx];
        }
        else{
            bob+=bobValues[idx];
        }
    }
    if(alice>bob)
    return 1;
         else if(bob>alice)
        return -1;
        else
        return 0;
    }
}