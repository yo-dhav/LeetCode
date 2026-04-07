class BTBSS {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i : prices) {
            if (i < min ){
                min = i;
            } else {
                maxprofit = Math.max(maxprofit, i - min);
            }
        }

        return maxprofit;
    }
}