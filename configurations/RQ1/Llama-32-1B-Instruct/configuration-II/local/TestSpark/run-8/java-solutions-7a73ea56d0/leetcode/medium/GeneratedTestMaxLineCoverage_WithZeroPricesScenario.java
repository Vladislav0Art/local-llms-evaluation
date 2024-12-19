package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestMaxLineCoverage_WithZeroPricesScenario {

    private OnlineStockSpan onlineStockSpan;

    @BeforeEach
    public void init() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    public void testMaxLineCoverage_WithZeroPricesScenario() {
        int[] prices = {};
        onlineStockSpan.list = new ArrayList<>(prices);
        onlineStockSpan.calculateSpans(prices);
        // No spans needed in this case, but just to confirm no exception is thrown
        assert onlineStockSpan.list.isEmpty();
    }

}