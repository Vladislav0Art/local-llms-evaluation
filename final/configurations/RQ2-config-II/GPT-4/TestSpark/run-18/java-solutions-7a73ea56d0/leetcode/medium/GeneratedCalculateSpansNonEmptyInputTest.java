package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansNonEmptyInputTest {

    @Test
    public void calculateSpansNonEmptyInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 105, 85, 90, 110};
        int[] expectedSpans = new int[]{1, 2, 1, 2, 5};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}