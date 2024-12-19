package leetcode.medium;

public class GeneratedTestMaxLineCoverage_MultiplePrices_3 {

    private OnlineStockSpan instance;

    @Before
    public void setup() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_MultiplePrices_3() {
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 4, 2, 6, 5};
        int actual = instance.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}