package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansMultipleElementsArrayTest {

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expectedResultSpans = new int[]{1, 1, 1, 2, 1, 4, 6};
        int[] resultantSpans = onlineStockSpan.calculateSpans(prices);

        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedResultSpans[i], resultantSpans[i]);
        }
    }

}