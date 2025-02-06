package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansDuplicatePriceTest {

    @Test
    public void calculateSpansDuplicatePriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] expected = {1, 2, 1, 3, 4, 1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}