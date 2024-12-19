package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestMaxLineCoverage_WithNegativePricesScenario {

    private OnlineStockSpan onlineStockSpan;

    @BeforeEach
    public void init() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_WithNegativePricesScenario() {
        int[] prices = {-10, -20, 0, 50};
        onlineStockSpan.list = new ArrayList<>(prices);
        int[] expectedSpans = {1, 2, 1, 1};
        onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

}