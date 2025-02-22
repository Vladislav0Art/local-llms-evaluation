package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansTest3 {

    @Test
    public void calculateSpansTest3() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 50, 10};
        int[] expected = {1, 1, 1};
        int[] actual = stockSpan.calculateSpans(prices);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

}