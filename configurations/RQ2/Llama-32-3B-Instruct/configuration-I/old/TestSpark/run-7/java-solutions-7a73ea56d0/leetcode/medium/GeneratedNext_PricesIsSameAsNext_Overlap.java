package leetcode.medium;

public class GeneratedNext_PricesIsSameAsNext_Overlap {

    private int[] prices;
    private int nextSpan;

    public OnlineStockSpan(int[] prices) {
        this.prices = prices;
    }

    public int next(int price) {
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Prices cannot be null or empty");
        }
        if (price == null) {
            throw new IllegalArgumentException("Price cannot be null");
        }

        int left = 0;
        int right = prices.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (prices[mid] < price) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        nextSpan++;

        return prices.length - right;
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = next(i);
        }
        return result;
    }
}

public class OnlineStockSpanTest {

    @Test
    public void next_PricesIsSameAsNext_Overlap() {
        int[] prices = {10, 10};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan(prices);
        int price = 10;
        assertEquals(2, onlineStockSpan.next(price));
    }

}