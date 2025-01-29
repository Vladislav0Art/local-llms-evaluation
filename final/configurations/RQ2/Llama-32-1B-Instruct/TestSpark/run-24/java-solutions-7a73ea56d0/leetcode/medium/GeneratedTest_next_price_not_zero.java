package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_next_price_not_zero {

    @Test
    public void test_next_price_not_zero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(0));
        assertEquals(-1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(100));
        assertEquals(4, onlineStockSpan.next(300));
    }

}