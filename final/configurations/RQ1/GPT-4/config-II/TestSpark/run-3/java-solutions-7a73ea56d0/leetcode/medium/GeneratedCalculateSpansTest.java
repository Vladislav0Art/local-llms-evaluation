package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 4, 5, 90, 120, 80};
        int[] expected = {1, 1, 2, 4, 5, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}