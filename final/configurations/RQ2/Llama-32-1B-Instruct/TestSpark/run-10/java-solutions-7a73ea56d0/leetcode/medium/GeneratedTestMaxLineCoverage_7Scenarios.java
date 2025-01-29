package leetcode.medium;

public class GeneratedTestMaxLineCoverage_7Scenarios {

    private OnlineStockSpan instance;

    @Before
    public void setUp() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_7Scenarios() throws Exception {
        int[] prices = {10, 7, 6, 5};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(1, result); // Coverage: 100%
    }

}