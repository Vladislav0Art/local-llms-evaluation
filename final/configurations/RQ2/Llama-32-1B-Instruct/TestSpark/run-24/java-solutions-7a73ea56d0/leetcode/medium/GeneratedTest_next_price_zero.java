package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_next_price_zero {

    @Test
    public void test_next_price_zero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(0, onlineStockSpan.next(0));
        assertEquals(-1, onlineStockSpan.next(10));
        assertEquals(0, onlineStockSpan.next(100));
        assertEquals(-1, onlineStockSpan.next(300));
    }

}