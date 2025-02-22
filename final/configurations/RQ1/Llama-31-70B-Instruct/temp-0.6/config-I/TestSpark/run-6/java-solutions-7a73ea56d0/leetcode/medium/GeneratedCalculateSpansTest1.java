package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 12, 8, 9};
        int[] result = stockSpan.calculateSpans(prices);
        int[] expected = {1, 1, 3, 1, 2};

        assertArrayEquals(expected, result);
    }

}