package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansAllEqualInputTest {

    @Test
    public void calculateSpansAllEqualInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 100, 100, 100, 100};
        int[] expectedSpans = new int[]{1, 2, 3, 4, 5};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}