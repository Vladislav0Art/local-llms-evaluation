package leetcode.medium;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setup() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        int price = 10;
        int expected = 1;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 15, 20, 15, 25, 30};
        int[] expected = {1, 2, 3, 1, 2, 1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}