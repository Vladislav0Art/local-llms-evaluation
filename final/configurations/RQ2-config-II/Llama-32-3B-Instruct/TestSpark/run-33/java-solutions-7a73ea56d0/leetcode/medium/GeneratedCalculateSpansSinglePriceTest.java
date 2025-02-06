package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}