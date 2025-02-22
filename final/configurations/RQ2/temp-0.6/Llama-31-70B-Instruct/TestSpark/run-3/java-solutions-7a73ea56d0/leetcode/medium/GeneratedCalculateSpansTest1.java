package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 5};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
    }

}