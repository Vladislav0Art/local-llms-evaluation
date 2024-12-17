package leetcode.medium;

public class GeneratedTestCalculateSpansWithMock_SimpleCase_2 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    public static class NextTest extends TestOnlineStockSpan {

        @Test
        public void testCalculateSpansWithMock_SimpleCase_2() {
            int[] prices = {5, 8, 11};
            MockitoAnnotations.initMocks(this);
            when(onlineStockSpan.next(anyInt())).thenReturn(2);
            when(onlineStockSpan.calculateSpans(anyInt())).thenReturn(new int[]{3});
            onlineStockSpan = new OnlineStockSpan();
            int[][] expected = {{2, 4}, {5, 9}};
            int actual = onlineStockSpan.calculateSpans(prices);
            assertEquals(expected[0], actual[0]);
            assertEquals(expected[1], actual[1]);
        }

    }