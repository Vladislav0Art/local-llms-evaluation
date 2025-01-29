package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_noPrices {

    @Test
    public void test_calculateSpans_noPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {0};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}