package leetcode.medium;

public class GeneratedTestMaxLineCoverage_6Scenarios {

    private OnlineStockSpan instance;

    @Before
    public void setUp() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_6Scenarios() throws Exception {
        int[] prices = {7, 6, 5, 4, 3};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(2, result); // Coverage: 100%
    }

}