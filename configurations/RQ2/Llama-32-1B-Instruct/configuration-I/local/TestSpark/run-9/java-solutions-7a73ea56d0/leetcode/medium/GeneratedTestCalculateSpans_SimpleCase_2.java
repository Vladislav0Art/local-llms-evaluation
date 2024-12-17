package leetcode.medium;

public class GeneratedTestCalculateSpans_SimpleCase_2 {

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
        public void testCalculateSpans_SimpleCase_2() {
            int[] prices = {5, 8, 11};
            int[][] expected = {{2, 4}, {5, 9}};
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(10);
            onlineStockSpan.next(15);
            onlineStockSpan.calculateSpans(prices);
            assertEquals(expected[0], onlineStockSpan.calculateSpans(prices)[0]);
            assertEquals(expected[1], onlineStockSpan.calculateSpans(prices)[1]);
        }
    }

    public static class MaximizeLineCoverageAndCalculateSpansTest extends TestCase {
        @Before
        public void setup() {
            onlineStockSpan = new OnlineStockSpan();
        }

    }