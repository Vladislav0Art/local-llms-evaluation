package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 1, 101, 102, 103, 104};
        int[] expectedSpans = {1, 1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}