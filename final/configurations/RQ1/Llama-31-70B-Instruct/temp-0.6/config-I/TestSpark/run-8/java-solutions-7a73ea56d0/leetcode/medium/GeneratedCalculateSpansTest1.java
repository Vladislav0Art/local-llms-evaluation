package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        int[] prices = {10, 20, 30, 40};
        int[] expectedSpans = {1, 2, 3, 4};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}