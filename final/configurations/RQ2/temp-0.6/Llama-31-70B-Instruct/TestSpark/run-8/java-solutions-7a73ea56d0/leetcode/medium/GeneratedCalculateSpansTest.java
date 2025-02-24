package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 1, 1, 2};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        int[] expectedSpans = {1, 1, 1, 2, 1, 2};
        assertArrayEquals(expectedSpans, actualSpans);
    }

}