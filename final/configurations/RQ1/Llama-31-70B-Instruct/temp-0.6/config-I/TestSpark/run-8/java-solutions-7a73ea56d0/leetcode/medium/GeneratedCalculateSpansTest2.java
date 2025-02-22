package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        int[] prices = {50, 40, 30, 20};
        int[] expectedSpans = {1, 1, 1, 1};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}