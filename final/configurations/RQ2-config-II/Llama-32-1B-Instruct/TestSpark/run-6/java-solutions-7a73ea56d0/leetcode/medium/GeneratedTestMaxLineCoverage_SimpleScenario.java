package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestMaxLineCoverage_SimpleScenario {

    @Test
    public void testMaxLineCoverage_SimpleScenario() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {12, 13, 15};
        int[] expected = {1, 1, 2};
        int actual = instance.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}