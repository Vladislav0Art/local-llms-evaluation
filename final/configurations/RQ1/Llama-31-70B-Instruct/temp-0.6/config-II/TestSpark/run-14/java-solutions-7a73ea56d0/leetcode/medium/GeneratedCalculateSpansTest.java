package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int[] expectedSpans = new int[]{1, 2, 3, 4, 5};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}