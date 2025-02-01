package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceLessThanPreviousTest {

    @Test
    public void nextPriceLessThanPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{90, 95, 99};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int result = onlineStockSpan.next(94);
        assertEquals("Span for price less than previous should be 1", 1, result);
    }

}