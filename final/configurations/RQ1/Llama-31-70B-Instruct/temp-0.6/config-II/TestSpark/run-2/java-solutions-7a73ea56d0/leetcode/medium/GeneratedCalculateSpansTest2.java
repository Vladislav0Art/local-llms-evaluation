package leetcode.medium;

public class GeneratedCalculateSpansTest2 {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest2() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}