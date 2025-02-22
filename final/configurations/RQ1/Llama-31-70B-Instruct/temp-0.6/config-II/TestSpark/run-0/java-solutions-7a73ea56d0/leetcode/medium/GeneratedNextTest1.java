package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(10));
        assertEquals(2, stock.next(20));
        assertEquals(1, stock.next(5));
        assertEquals(6, stock.next(70));
        assertEquals(4, stock.next(60));
        assertEquals(1, stock.next(20));
        assertEquals(1, stock.next(15));
    }

}