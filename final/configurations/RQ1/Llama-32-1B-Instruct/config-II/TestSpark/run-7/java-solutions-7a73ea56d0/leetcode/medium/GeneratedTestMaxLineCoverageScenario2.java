package leetcode.medium;

public class GeneratedTestMaxLineCoverageScenario2 {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverageScenario2() throws Exception {
        int[] prices = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedSpans = {9, 10, 11, 12, 13, 14, 15, 16};
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(8);
        onlineStockSpan.next(7);
        onlineStockSpan.next(6);
        onlineStockSpan.next(5);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        onlineStockSpan.next(2);
        onlineStockSpan.next(1);

        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}