package leetcode.medium;

public class GeneratedTestMaxLineCoverage_EmptyList_1 {

    private OnlineStockSpan instance;

    @Before
    public void setup() {
        instance = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_EmptyList_1() {
        List<Integer> prices = new ArrayList<>();
        int[] expected = {0};
        int actual = instance.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}