package leetcode.medium;

public class GeneratedTestMaxLineCoverage_5Scenarios {

    private OnlineStockSpan instance;

    @Before
    public void setUp() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_5Scenarios() throws Exception {
        int[] prices = {10, 7, 6, 5, 4};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(3, result); // Coverage: 100%
    }

}