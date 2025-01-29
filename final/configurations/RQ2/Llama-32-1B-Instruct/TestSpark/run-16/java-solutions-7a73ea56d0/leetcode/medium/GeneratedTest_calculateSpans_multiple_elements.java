package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_multiple_elements {

    @Test
    public void test_calculateSpans_multiple_elements() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 33, 21, 50, 41, 60};
        int[] expected = {1, 2, 4, 3, 2, 5, 6};
        int[] result = solver.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}