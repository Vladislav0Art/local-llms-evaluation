package leetcode.medium;

public class GeneratedTestNextSpans {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNextSpans() {
        int[] prices = {10, 20, 30, 40, 50, 60};
        int[] expectedSpans = {1, 1, 1, 1, 1, 1};

        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedSpans[i], onlineStockSpan.next(prices[i]));
        }
    }

}