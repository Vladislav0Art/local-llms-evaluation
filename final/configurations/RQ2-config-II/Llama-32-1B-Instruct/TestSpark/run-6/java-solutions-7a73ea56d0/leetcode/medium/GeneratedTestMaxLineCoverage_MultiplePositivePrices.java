package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestMaxLineCoverage_MultiplePositivePrices {

    @Test
    public void testMaxLineCoverage_MultiplePositivePrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = {1, 2, 3};
        int actual = instance.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}