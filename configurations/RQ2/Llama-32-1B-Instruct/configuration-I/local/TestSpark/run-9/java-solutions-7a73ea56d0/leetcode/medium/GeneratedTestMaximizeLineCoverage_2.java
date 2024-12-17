package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_2 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    public static class NextTest extends TestOnlineStockSpan {

        @Test
        public void testMaximizeLineCoverage_2() {
            int[] prices = {5, 8, 11};
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(10);
            onlineStockSpan.next(15);
        }
    }

    public static class CalculateSpansWithMockTest extends TestOnlineStockSpan {
        @Before
        public void setup() {
            onlineStockSpan = new OnlineStockSpan();
        }

    }