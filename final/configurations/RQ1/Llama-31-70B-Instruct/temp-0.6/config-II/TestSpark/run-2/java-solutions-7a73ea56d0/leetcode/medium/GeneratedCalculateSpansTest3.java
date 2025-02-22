package leetcode.medium;

public class GeneratedCalculateSpansTest3 {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest3() {
        int[] prices = {5, 4, 3, 2, 1};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}