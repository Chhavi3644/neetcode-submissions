class Solution {
    public int maxProfit(int[] prices) {
        int mn=0;
        int mx=1;
        int prof=0;
        while(mx<prices.length){
           if(prices[mn]<prices[mx]){
            int cp=prices[mx]-prices[mn];
            prof=Math.max(prof,cp);
           }else{
            mn=mx;
           }
           mx++;

            
        }
        return prof;
      
    }
}
