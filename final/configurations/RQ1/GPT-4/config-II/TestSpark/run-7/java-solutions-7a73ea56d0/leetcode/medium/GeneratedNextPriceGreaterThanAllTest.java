package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceGreaterThanAllTest {

    @Test
    public void nextPriceGreaterThanAllTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{90, 95, 98};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        int result = onlineStockSpan.next(100);
        assertEquals("Span for price greater than all previous should be equal to count of all previous", 4, result);
    }

}