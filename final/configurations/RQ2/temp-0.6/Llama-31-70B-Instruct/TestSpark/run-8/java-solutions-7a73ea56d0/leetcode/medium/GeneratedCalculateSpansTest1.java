package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}