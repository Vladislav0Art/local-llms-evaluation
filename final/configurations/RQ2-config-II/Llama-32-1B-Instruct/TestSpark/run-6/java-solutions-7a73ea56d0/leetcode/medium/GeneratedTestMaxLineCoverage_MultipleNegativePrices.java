package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestMaxLineCoverage_MultipleNegativePrices {

    @Test
    public void testMaxLineCoverage_MultipleNegativePrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-10, -20, -30};
        int[] expected = {1, 2, 3};
        int actual = instance.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2, 4",
            "-1, -3, 0, 0"
    })
    public void testMaxLineCoverage_MultiplePrices(int price1, int price2, int maxPrice, int expected) {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {price1, price2};
        int actual = instance.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}