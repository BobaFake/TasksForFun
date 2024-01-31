public class MaxProfit {
    public static void main(String[] args) {
        int[] stocks = {8,3,3,1,4,9,12,11};

        System.out.println(maxProfit(stocks));

    }

    public static int maxProfit(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int currentPrice = arr[i];
            int currentProfit = currentPrice - minPrice;

            maxProfit = Math.max(maxProfit, currentProfit);
            minPrice = Math.min(minPrice, currentPrice);

        }

        return maxProfit;
    }

}
/*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it on one day and selling oon another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */