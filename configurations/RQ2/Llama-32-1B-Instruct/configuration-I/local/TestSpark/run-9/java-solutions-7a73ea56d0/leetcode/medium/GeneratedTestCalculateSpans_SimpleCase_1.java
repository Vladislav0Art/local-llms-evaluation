package leetcode.medium;

public class GeneratedTestCalculateSpans_SimpleCase_1 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    public static class NextTest extends TestCase {
        private OnlineStockSpan onlineStockSpan;

        @Before
        public void setup() {
            onlineStockSpan = new OnlineStockSpan();
        }

        @Test
        public void testCalculateSpans_SimpleCase_1() {
            int[] prices = {10, 20, 30};
            int[][] expected = {{1, 2}, {3, 4}};
            int actual = onlineStockSpan.calculateSpans(prices);
            assertEquals(expected[0], actual[0]);
            assertEquals(expected[1], actual[1]);
        }

    }