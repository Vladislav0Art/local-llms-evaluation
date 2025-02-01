package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceEqualToPreviousTest {

    @Test
    public void nextPriceEqualToPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{90, 95, 99};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int result = onlineStockSpan.next(99);
        assertEquals("Span for price equal to previous should be count of all equal or less", 2, result);
    }

}