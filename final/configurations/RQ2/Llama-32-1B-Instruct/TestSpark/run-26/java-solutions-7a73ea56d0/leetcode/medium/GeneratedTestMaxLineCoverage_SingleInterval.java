package leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestMaxLineCoverage_SingleInterval {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @BeforeEach
    public void setUp() {
        prices = new int[]{1, 2, 3, 0, 2};
        spans = new int[prices.length];
    }

    @Test
    public void testMaxLineCoverage_SingleInterval() {
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(5, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(4, result[4]);
    }

}