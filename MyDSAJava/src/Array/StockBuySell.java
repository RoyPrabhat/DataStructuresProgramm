package Array;

public class StockBuySell {
    public static void main(String[] args)
    {
        int price[] = { 100, 180, 260, 310,
                40, 535, 695 };
        int n = price.length;

        System.out.print(maxProfit(price, 0, n - 1));
    }

    private static int maxProfit(int[] price, int start, int end) {
        int maxProfit = 0;
        int increasing = -1;
        int lastBoughtDate = 0;
        for(int i = 1; i<= end; i++){
            
        }

        return maxProfit;
    }
}
