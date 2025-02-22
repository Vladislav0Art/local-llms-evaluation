package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 20};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
        assertEquals(2, result[2]);
    }

}