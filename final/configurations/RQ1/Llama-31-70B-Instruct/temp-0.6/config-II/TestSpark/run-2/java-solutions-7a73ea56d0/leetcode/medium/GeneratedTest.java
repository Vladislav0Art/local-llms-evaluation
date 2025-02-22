package leetcode.medium;

public class GeneratedTest {

    private OnlineStockSpan stockSpan;

    @Before
    public void setUp() {
        stockSpan = new OnlineStockSpan();
    }

    @Test
    public void nextTest1() {
        int result = stockSpan.next(5);
        assertEquals(1, result);
    }

    @Test
    public void nextTest2() {
        stockSpan.next(5);
        int result = stockSpan.next(4);
        assertEquals(2, result);
    }

    @Test
    public void nextTest3() {
        stockSpan.next(5);
        stockSpan.next(4);
        int result = stockSpan.next(3);
        assertEquals(3, result);
    }

    @Test
    public void calculateSpansTest1() {
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansTest2() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansTest3() {
        int[] prices = {5, 4, 3, 2, 1};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}