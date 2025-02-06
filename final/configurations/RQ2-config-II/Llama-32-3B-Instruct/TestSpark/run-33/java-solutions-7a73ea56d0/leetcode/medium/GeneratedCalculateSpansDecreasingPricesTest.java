package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansDecreasingPricesTest {

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}