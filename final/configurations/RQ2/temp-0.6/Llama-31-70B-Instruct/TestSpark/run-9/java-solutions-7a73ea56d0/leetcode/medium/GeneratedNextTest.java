package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan s = new OnlineStockSpan();
        assertEquals(0, s.next(100));
        assertEquals(1, s.next(80));
        assertEquals(1, s.next(60));
        assertEquals(1, s.next(70));
        assertEquals(2, s.next(60));
        assertEquals(1, s.next(75));
        assertEquals(4, s.next(85));
    }

}