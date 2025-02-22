package leetcode.medium;

public class GeneratedTestCalculateSpans {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testCalculateSpans() {
        int[] prices = {5, 10, 20, 50, 100, 200};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}