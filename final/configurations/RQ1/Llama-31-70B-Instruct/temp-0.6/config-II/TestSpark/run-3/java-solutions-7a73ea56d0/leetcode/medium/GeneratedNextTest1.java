package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(1, stockSpan.next(2));
        assertEquals(2, stockSpan.next(3));
        assertEquals(3, stockSpan.next(4));
        assertEquals(3, stockSpan.next(3));
        assertEquals(2, stockSpan.next(2));
        assertEquals(1, stockSpan.next(1));
    }

}