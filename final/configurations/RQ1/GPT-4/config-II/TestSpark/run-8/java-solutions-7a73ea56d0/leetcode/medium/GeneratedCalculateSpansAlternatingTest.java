package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAlternatingTest {

    @Test
    public void calculateSpansAlternatingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 101, 100, 101, 100};
        int[] expected = new int[]{1, 2, 1, 2, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}