package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 10};
        int[] expected = {1, 1, 2};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}