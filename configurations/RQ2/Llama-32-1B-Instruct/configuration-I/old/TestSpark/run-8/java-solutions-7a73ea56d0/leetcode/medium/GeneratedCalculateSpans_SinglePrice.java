package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedCalculateSpans_SinglePrice {

    @Test
    public void calculateSpans_SinglePrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 2;
        int[] prices = {price};
        int[] expected = {1, 1};
        int actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

}