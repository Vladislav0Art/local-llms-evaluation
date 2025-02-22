package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(5));
        assertEquals(2, onlineStockSpan.next(4));
        assertEquals(1, onlineStockSpan.next(1));
        assertEquals(1, onlineStockSpan.next(3));
        assertEquals(2, onlineStockSpan.next(6));
        assertEquals(1, onlineStockSpan.next(2));
    }

}