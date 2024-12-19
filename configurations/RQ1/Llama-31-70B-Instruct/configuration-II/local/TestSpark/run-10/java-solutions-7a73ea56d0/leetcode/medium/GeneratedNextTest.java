package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(20));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(100));
        assertEquals(4, stockSpan.next(80));
        assertEquals(1, stockSpan.next(60));
        assertEquals(1, stockSpan.next(70));
        assertEquals(2, stockSpan.next(60));
        assertEquals(1, stockSpan.next(75));
        assertEquals(4, stockSpan.next(85));
    }

}