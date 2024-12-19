package leetcode.medium;

public class GeneratedTestMaxLineCoverage_SinglePrice_1 {

    private OnlineStockSpan instance;

    @Before
    public void setup() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_SinglePrice_1() {
        int[] prices = {1};
        int[] expected = {1};
        int actual = instance.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}