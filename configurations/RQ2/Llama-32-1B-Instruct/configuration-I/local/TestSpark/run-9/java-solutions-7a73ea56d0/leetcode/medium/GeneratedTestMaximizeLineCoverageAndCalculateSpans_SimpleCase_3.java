package leetcode.medium;

public class GeneratedTestMaximizeLineCoverageAndCalculateSpans_SimpleCase_3 {

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
        public void testMaximizeLineCoverageAndCalculateSpans_SimpleCase_3() {
            int[] prices = {10, 20};
            onlineStockSpan.next(10);
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
        }
    }

    public static class MaximizeLineCoverageAndCalculateSpansAndSimpleTest extends TestCase {
        @Before
        public void setup() {
            onlineStockSpan = new OnlineStockSpan();
        }

    }