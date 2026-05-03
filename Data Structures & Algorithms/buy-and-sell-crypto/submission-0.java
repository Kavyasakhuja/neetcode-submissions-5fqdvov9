class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int left=0;
        int right=1;
        int c=0;
        while(right< prices.length){
            c=prices[right] - prices[left];
            if(c<=0){
                left=right;
                right++;
            }
            else{
                if(c>=max){
                    max=c;
                }
                right++;
            }
        }
        return max;
    }
}
