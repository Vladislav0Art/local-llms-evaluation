package leetcode.medium;

public class GeneratedTestCalculateSpans_SimpleCase_3 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    public static class NextTest extends TestOnlineStockSpan {

        @Test
        public void testCalculateSpans_SimpleCase_3() {
            int[] prices = {10, 20};
            int[][] expected = {{2, 4}, {5, 9}};
            int actual = onlineStockSpan.calculateSpans(prices);
            assertEquals(expected[0], actual[0]);
            assertEquals(expected[1], actual[1]);
        }
    }

    public static class MaximizeLineCoverageTest extends TestOnlineStockSpan {
        @Before
        public void setup() {
            onlineStockSpan = new OnlineStockSpan();
        }

    }