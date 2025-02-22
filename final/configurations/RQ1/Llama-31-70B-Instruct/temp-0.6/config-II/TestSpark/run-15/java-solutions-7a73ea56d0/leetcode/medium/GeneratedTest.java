package leetcode.medium;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest() {
        int price = 5;
        int expected = 1;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void nextTest2() {
        int price = 10;
        int expected = 1;
        int actual = onlineStockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {10, 5, 3, 6, 2, 1};
        int[] expected = {1, 1, 1, 2, 1, 1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void calculateSpansTest2() {
        int[] prices = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void calculateSpansTest3() {
        int[] prices = {6, 5, 4, 3, 2, 1
        }

    }