package leetcode.medium;

public class GeneratedTestMaxLineCoverage_MultiplePrices_2 {

    private OnlineStockSpan instance;

    @Before
    public void setup() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_MultiplePrices_2() {
        int[] prices = {3, 5, 0, 6, 8};
        int[] expected = {1, 4};
        int actual = instance.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}