package leetcode.medium;

public class GeneratedTestNextSpansWithDecreasingPrices {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNextSpansWithDecreasingPrices() {
        int[] prices = {10, 20, 30, 40, 50, 60, 50, 40, 30, 20, 10};
        int[] expectedSpans = {1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6};

        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedSpans[i], onlineStockSpan.next(prices[i]));
        }
    }

}