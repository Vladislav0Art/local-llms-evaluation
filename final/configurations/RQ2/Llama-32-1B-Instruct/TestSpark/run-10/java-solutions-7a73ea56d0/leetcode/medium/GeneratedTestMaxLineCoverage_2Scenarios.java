package leetcode.medium;

public class GeneratedTestMaxLineCoverage_2Scenarios {

    private OnlineStockSpan instance;

    @Before
    public void setUp() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_2Scenarios() throws Exception {
        int[] prices = {10, 5, 7, 6, 3, 9};
        int[] expected = new int[]{1, 0, 2, 1, 4, 7};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(30, result); // Coverage: 100%
    }

}