package leetcode.medium;

public class GeneratedTest_maxLineCoverageEmptyArray {

    @Test
    public void test_maxLineCoverageEmptyArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        assertThrows(EmptyArrayException.class, () -> instance.calculateSpans(prices));
    }

}