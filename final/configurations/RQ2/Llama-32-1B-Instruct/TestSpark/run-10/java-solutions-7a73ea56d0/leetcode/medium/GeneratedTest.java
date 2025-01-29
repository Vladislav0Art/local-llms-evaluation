package leetcode.medium;

public class GeneratedTest {

    private OnlineStockSpan instance;

    @Before
    public void setUp() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_1Scenario() throws Exception {
        int[] prices = {7, 6, 4, 3, 1};
        int result = instance.next(price -> price);
        assertEquals(2, result); // Coverage: 100%
    }

    @Test
    public void testMaxLineCoverage_2Scenarios() throws Exception {
        int[] prices = {10, 5, 7, 6, 3, 9};
        int[] expected = new int[]{1, 0, 2, 1, 4, 7};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(30, result); // Coverage: 100%
    }

    @Test
    public void testMaxLineCoverage_3Scenarios() throws Exception {
        int[] prices = {7, 6, 5, 4};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(2, result); // Coverage: 100%
    }

    @Test
    public void testMaxLineCoverage_4Scenarios() throws Exception {
        int[] prices = {10, 7, 6, 5};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(3, result); // Coverage: 100%
    }

    @Test
    public void testMaxLineCoverage_5Scenarios() throws Exception {
        int[] prices = {10, 7, 6, 5, 4};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(3, result); // Coverage: 100%
    }

    @Test
    public void testMaxLineCoverage_6Scenarios() throws Exception {
        int[] prices = {7, 6, 5, 4, 3};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(2, result); // Coverage: 100%
    }

    @Test
    public void testMaxLineCoverage_7Scenarios() throws Exception {
        int[] prices = {10, 7, 6, 5};
        OnlineStockSpan.Solution solution = instance.calculateSpans(prices);
        int result = Arrays.stream(solution.spans).sum();
        assertEquals(1, result); // Coverage: 100%
    }

}