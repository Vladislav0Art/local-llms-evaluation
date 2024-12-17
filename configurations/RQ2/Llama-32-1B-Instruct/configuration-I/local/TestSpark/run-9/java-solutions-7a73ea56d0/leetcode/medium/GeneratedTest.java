package leetcode.medium;

public class GeneratedTest {

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
        public void testNext_SimpleCase_1() {
            int[] prices = {10, 20, 30};
            int expected = 3;
            int actual = onlineStockSpan.next(10);
            assertEquals(expected, actual);
        }

        @Test
        public void testNext_SimpleCase_2() {
            int[] prices = {5, 8, 11};
            int expected = 1;
            int actual = onlineStockSpan.next(5);
            assertEquals(expected, actual);
        }
    }

    public static class CalculateSpansTest extends TestCase {
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

        @Test
        public void testMaximizeLineCoverageAndCalculateSpans_SimpleCase_1() {
            int[] prices = {10, 20, 30};
            onlineStockSpan.next(10);
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(15);
            onlineStockSpan.next(22);
        }

        @Test
        public void testMaximizeLineCoverageAndCalculateSpans_SimpleCase_2() {
            int[] prices = {5, 8, 11};
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(10);
            onlineStockSpan.calculateSpans(prices);
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

        @Test
        public void testMaximizeLineCoverageAndCalculateSpansAndSimple_SimpleCase_1() {
            int[] prices = {10, 20, 30};
            onlineStockSpan.next(10);
            onlineStockSpan.next(5);
            onlineStockSpan.next(8);
            onlineStockSpan.next(15);
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