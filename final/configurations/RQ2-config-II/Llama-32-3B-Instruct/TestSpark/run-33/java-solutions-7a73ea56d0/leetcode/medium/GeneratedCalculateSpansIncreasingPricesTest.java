package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansIncreasingPricesTest {

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}