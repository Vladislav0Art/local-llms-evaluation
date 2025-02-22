package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100};
        int[] expectedSpans = {1, 2, 3, 4};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}