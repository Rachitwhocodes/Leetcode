class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int profit=0;
        // int minindex=0;
        // for(int i=0; i<n; i++){
        //     if(prices[i]<buy){
        //         buy=prices[i];
        //         minindex=i;
        //     }
        // }
        // int sell=prices[minindex];
        // for(int i=minindex; i<n; i++){
        //     if(sell<prices[i]){
        //         sell=prices[i];
        //     }
        // }
        // return sell-buy;
        for(int i=0; i<n; i++){ 
               int total=prices[i]-buy;
               if(total>profit){
                profit=total;
               }
               if(buy>prices[i]){
                buy=prices[i];
               }
            
        }
        return profit;
    }
}