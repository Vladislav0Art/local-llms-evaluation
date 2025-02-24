package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 15, 20, 15, 10};
        int[] expected = {1, 2, 3, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}