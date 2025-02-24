package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIsMixedTest {

    @Test
    public void nextIsMixedTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(15));
        assertEquals(2, stockSpan.next(14));
        assertEquals(1, stockSpan.next(13));
        assertEquals(1, stockSpan.next(12));
    }

}