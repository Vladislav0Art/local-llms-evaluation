package leetcode.medium;

public class GeneratedTestMaximizeLineCoverage_1 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    public static class NextTest extends TestOnlineStockSpan {

        @Test
        public void testMaximizeLineCoverage_1() {
            int[] prices = {10, 20, 30};
            onlineStockSpan.next(10);
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(15);
            onlineStockSpan.next(22);
        }

    }