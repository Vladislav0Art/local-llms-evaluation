package leetcode.medium;

public class GeneratedTestMaxLineCoverage_NullPrices {

    private OnlineStockSpan instance;

    @Before
    public void setup() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_NullPrices() {
        assertThrows(NullPointerException.class, () -> instance.calculateSpans(null));
    }

}