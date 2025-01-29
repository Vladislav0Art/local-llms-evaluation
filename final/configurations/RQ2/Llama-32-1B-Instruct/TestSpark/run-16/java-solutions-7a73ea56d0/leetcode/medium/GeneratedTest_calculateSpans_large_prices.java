package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_large_prices {

    @Test
    public void test_calculateSpans_large_prices() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10000, 20000, 30000};
        int[] expected = {1, 2, 4};
        int[] result = solver.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}