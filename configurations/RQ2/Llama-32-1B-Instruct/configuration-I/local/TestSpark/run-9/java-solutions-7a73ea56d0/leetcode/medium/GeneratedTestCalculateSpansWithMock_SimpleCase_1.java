package leetcode.medium;

public class GeneratedTestCalculateSpansWithMock_SimpleCase_1 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    public static class NextTest extends TestOnlineStockSpan {

        @Test
        public void testCalculateSpansWithMock_SimpleCase_1() {
            int[] prices = {10, 20, 30};
            MockitoAnnotations.initMocks(this);
            when(onlineStockSpan.next(anyInt())).thenReturn(1);
            when(onlineStockSpan.calculateSpans(anyInt())).thenReturn(new int[]{2, 3});
            onlineStockSpan = new OnlineStockSpan();
            int[][] expected = {{1, 2}, {3, 4}};
            int actual = onlineStockSpan.calculateSpans(prices);
            assertEquals(expected[0], actual[0]);
            assertEquals(expected[1], actual[1]);
        }

    }