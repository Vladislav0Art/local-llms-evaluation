package leetcode.medium;

public class GeneratedTestMaximizeLineCoverageAndCalculateSpansAndSimple_SimpleCase_2 {

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
        public void testMaximizeLineCoverageAndCalculateSpansAndSimple_SimpleCase_2() {
            int[] prices = {5, 8, 11};
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(10);
        }
    }

    private OnlineStockSpan getOnlineStockSpan() {
        return onlineStockSpan;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        onlineStockSpan = new OnlineStockSpan();
    }

    public void testMaximizeLineCoverageAndCalculateSpans() {
        testMaximizeLineCoverageAndCalculateSpans_SimpleCase_1();
        testMaximizeLineCoverageAndCalculateSpans_SimpleCase_2();
        testMaximizeLineCoverageAndCalculateSpans_SimpleCase_3();
    }

}