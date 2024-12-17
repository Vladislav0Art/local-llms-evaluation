package leetcode.medium;

public class GeneratedTestNext_SimpleCase_2 {

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

    }