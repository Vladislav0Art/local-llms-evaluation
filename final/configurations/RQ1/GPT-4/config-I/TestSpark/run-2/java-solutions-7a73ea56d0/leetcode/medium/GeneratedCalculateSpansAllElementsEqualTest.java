package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansAllElementsEqualTest {

    @Test
    public void calculateSpansAllElementsEqualTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10, 10};
        int[] expectedSpans = {1, 2, 3, 4};
        assertEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}