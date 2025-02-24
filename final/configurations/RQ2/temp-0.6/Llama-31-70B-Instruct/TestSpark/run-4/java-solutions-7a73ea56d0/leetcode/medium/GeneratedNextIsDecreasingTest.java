package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIsDecreasingTest {

    @Test
    public void nextIsDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(20));
        assertEquals(1, stockSpan.next(15));
        assertEquals(1, stockSpan.next(10));
    }

}