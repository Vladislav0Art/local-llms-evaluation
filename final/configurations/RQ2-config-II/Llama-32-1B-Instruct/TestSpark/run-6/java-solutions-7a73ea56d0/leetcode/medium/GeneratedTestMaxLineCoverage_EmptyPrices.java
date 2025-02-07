package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestMaxLineCoverage_EmptyPrices {

    @Test
    public void testMaxLineCoverage_EmptyPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        int expected = 0;
        int actual = instance.calculateSpans(prices);
        assert (actual == expected);
    }

}