package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSimplePriceTest {

    @Test
    public void calculateSpansSimplePriceTest() {
        int[] prices = new int[]{1, 2};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1}, result);
    }

}