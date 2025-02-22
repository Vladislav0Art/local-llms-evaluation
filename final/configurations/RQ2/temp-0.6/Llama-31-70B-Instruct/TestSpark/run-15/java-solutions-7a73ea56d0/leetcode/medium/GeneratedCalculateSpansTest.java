package leetcode.medium;

public class GeneratedCalculateSpansTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 15, 20, 15, 25, 30};
        int[] expected = {1, 2, 3, 1, 2, 1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}