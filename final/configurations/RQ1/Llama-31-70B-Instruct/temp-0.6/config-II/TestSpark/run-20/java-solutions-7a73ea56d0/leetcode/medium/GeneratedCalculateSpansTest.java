package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    private OnlineStockSpan stockSpan;

    @Test
    public void calculateSpansTest() {
        stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 2, 1};
        int[] expected = {1, 2, 3, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}