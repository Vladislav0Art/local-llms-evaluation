package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMonotonicIncreasingTest {

    @Test
    public void calculateSpansMonotonicIncreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 101, 102, 103, 104};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}