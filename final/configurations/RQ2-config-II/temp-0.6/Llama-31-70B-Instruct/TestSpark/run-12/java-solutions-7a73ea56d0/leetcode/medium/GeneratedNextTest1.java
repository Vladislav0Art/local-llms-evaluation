package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(11));
        assertEquals(2, stockSpan.next(9));
        assertEquals(1, stockSpan.next(10));
    }

}