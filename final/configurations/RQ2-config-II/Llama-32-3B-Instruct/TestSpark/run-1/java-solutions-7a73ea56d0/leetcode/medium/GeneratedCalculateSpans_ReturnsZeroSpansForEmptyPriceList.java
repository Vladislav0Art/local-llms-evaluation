package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsZeroSpansForEmptyPriceList {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_ReturnsZeroSpansForEmptyPriceList() {
        int[] prices = {};
        int[] expected = {0};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}