class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total=0;
        for(int p:prices){
            total+=p;
        }
        int n=Math.min(prices.length,discounts.length);
        for(int i=0;i<n;i++){
            int price=prices[prices.length-1 -i];
            int discount =discounts[discounts.length-1-i];
            total-=(double)price*discount/100.0;
        }
        return total;
    }
}