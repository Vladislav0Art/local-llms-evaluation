package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestMaxLineCoverage_WithSimpleScenarioTest {

    private OnlineStockSpan onlineStockSpan;

    @BeforeEach
    public void init() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_WithSimpleScenarioTest() {
        int[] prices = {7, 6, 4, 3, 1};
        int[] expectedSpans = {1, 1, 2, 1, 1};
        onlineStockSpan.list = new ArrayList<>(prices);
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

}