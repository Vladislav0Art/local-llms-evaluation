package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_multiplePrices {

    @Test
    public void test_calculateSpans_multiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 200, 300};
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            expected[i] = 2;
        }
        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}