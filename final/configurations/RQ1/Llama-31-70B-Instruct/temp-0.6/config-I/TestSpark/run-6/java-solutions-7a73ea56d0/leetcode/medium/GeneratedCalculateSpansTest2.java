package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 15, 5, 12, 8, 9, 11, 13};
        int[] result = stockSpan.calculateSpans(prices);
        int[] expected = {1, 2, 1, 3, 1, 2, 3, 4};

        assertArrayEquals(expected, result);
    }

}