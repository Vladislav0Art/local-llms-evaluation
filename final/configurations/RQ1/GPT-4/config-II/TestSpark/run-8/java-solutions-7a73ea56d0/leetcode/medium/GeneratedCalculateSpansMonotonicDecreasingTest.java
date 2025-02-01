package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMonotonicDecreasingTest {

    @Test
    public void calculateSpansMonotonicDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{104, 103, 102, 101, 100};
        int[] expected = new int[]{1, 1, 1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}