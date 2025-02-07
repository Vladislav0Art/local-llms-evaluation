package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestMaxLineCoverage_BothZeroAndNegativePrices {

    @Test
    public void testMaxLineCoverage_BothZeroAndNegativePrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-1, -3, 0};
        int[] expected = {1, 0, 2};
        int actual = instance.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}