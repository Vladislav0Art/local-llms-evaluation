package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(5));
        assertEquals(2, onlineStockSpan.next(4));
        assertEquals(1, onlineStockSpan.next(3));
        assertEquals(1, onlineStockSpan.next(2));
        assertEquals(1, onlineStockSpan.next(1));
    }

}