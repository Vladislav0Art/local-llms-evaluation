package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    private OnlineStockSpan stockSpan;

    @Test
    public void nextTest() {
        stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(2, stockSpan.next(2));
        assertEquals(1, stockSpan.next(3));
        assertEquals(1, stockSpan.next(2));
        assertEquals(1, stockSpan.next(1));
    }

}