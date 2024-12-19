package leetcode.medium;

public class GeneratedNextMultipleSpans {

    @Test
    public void nextMultipleSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {2, 4, 0, 3, 2, 5, 3, 7};
        for (int price : prices) {
            stockSpan.next(price);
        }
        int[] spans = stockSpan.calculateSpans(prices);
        System.out.println(Arrays.toString(spans));
    }

}