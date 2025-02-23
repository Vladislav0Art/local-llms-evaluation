package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 11, 9, 10};
        int[] expectedSpans = {1, 2, 1, 1};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}