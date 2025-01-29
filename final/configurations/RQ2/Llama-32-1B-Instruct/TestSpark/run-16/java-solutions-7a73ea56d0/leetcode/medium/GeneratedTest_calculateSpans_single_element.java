package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_single_element {

    @Test
    public void test_calculateSpans_single_element() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = solver.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}