package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {0};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}