package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

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

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, s.calculateSpans(prices));
    }

}