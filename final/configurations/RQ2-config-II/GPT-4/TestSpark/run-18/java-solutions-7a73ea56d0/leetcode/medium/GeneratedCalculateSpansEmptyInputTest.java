package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansEmptyInputTest {

    @Test
    public void calculateSpansEmptyInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] expectedSpans = new int[]{};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}