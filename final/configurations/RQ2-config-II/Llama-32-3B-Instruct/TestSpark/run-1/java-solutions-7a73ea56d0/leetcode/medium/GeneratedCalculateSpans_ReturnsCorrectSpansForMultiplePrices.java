package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForMultiplePrices {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpansForMultiplePrices() {
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}