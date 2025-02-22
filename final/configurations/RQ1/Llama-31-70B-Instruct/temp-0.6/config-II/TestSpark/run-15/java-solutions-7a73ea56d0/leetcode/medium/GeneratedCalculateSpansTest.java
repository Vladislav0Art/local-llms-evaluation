package leetcode.medium;

public class GeneratedCalculateSpansTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 5, 3, 6, 2, 1};
        int[] expected = {1, 1, 1, 2, 1, 1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

}