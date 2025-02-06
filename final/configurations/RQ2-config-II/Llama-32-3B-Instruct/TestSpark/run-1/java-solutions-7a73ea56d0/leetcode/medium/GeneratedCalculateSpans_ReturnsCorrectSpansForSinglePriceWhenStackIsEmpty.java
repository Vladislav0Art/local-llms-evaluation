package leetcode.medium;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForSinglePriceWhenStackIsEmpty {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpans_ReturnsCorrectSpansForSinglePriceWhenStackIsEmpty() {
        stack.clear();
        stockSpan.calculateSpans(new int[]{price});
        assertArrayEquals(new int[]{1}, stockSpan.calculateSpans(new int[]{}));
    }

}