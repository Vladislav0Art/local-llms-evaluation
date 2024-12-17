package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedCalculateSpans_MultiplePrices {

    @Test
    public void calculateSpans_MultiplePrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {2, 3};
        int[] expected = {2, 4};
        int[] actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

}