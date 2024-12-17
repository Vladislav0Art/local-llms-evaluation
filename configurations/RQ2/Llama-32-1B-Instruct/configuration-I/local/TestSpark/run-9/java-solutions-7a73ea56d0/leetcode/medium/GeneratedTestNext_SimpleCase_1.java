package leetcode.medium;

public class GeneratedTestNext_SimpleCase_1 {

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

    }