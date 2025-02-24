package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(1, stockSpan.next(2));
        assertEquals(1, stockSpan.next(3));
        assertEquals(2, stockSpan.next(1));
        assertEquals(1, stockSpan.next(1));
        assertEquals(2, stockSpan.next(2));
    }

}