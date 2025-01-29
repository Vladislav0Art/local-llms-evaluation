package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_next_price_negative {

    @Test
    public void test_next_price_negative() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(-1, onlineStockSpan.next(-1));
        assertEquals(-2, onlineStockSpan.next(-10));
        assertEquals(-3, onlineStockSpan.next(-100));
        assertEquals(-4, onlineStockSpan.next(-300));
    }

}