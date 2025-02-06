package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansConsecutivePricesTest {

    @Test
    public void calculateSpansConsecutivePricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6};
        int[] expected = {1, 1, 2, 3, 4};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}