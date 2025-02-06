package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForSinglePrice {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpansForSinglePrice() {
        int[] prices = {10};
        int[] expected = {1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}