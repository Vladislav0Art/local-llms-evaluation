package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansComplexPriceTest {

    @Test
    public void calculateSpansComplexPriceTest() {
        int[] prices = new int[]{1, 2, 3, 4};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

}