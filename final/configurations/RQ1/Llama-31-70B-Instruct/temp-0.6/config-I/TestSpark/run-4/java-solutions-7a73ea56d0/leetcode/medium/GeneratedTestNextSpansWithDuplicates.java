package leetcode.medium;

public class GeneratedTestNextSpansWithDuplicates {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testNextSpansWithDuplicates() {
        int[] prices = {10, 10, 10, 10, 10};
        int[] expectedSpans = {1, 2, 3, 4, 5};

        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedSpans[i], onlineStockSpan.next(prices[i]));
        }
    }

}