package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

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

    @Test
    public void testMaxLineCoverage_WithNegativePricesScenario() {
        int[] prices = {-10, -20, 0, 50};
        onlineStockSpan.list = new ArrayList<>(prices);
        int[] expectedSpans = {1, 2, 1, 1};
        onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void testMaxLineCoverage_WithZeroPricesScenario() {
        int[] prices = {};
        onlineStockSpan.list = new ArrayList<>(prices);
        onlineStockSpan.calculateSpans(prices);
        // No spans needed in this case, but just to confirm no exception is thrown
        assert onlineStockSpan.list.isEmpty();
    }

    @Test
    public void testMaxLineCoverage_EmptyListScenario() {
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.next(100);
        onlineStockSpan.calculateSpans(new int[]{});

        assertEquals(0, onlineStockSpan.list.size());
    }

}