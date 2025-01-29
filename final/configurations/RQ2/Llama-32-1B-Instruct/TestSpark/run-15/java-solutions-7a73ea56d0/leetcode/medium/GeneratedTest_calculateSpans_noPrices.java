package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_noPrices {

    @Test
    public void test_calculateSpans_noPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            expected[i] = 1;
        }
        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}