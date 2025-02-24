package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(0, onlineStockSpan.next(10));
        assertEquals(1, onlineStockSpan.next(5));
        assertEquals(1, onlineStockSpan.next(2));
        assertEquals(1, onlineStockSpan.next(1));
    }

}