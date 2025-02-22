package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, spans);
    }

}