package leetcode.medium;

public class GeneratedCalculateSpansTest1 {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest1() {
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}