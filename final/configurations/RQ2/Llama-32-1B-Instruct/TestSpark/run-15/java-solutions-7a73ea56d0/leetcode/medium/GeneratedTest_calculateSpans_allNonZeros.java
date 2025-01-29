package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_allNonZeros {

    @Test
    public void test_calculateSpans_allNonZeros() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1000, 2000, 3000};
        int[] expected = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            expected[i] = 2;
        }
        assertEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}