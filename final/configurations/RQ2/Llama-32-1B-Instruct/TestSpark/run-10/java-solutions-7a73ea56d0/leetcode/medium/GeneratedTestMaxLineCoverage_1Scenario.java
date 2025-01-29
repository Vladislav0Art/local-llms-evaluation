package leetcode.medium;

public class GeneratedTestMaxLineCoverage_1Scenario {

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

}