package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] expected = {1, 1, 2, 4, 5, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}