package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyPriceTest {

    @Test
    public void calculateSpansEmptyPriceTest() {
        int[] prices = new int[]{};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result);
    }

}