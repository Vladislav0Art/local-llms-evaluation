package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedCalculateSpans_MultiplePrices_InvalidPrice {

    @Test
    public void calculateSpans_MultiplePrices_InvalidPrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = -100;
        int[] prices = {2, 3};
        int[] expected = {-100, 0};
        int actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1"
    })
    public void calculateSpans_MultiplePrices_SufficientLineCoverage(int price, int span) {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {price};
        int[] expected = {1, 2};
        int actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

}