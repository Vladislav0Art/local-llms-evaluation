package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        assertEquals(0, oss.next(10));
        assertEquals(1, oss.next(20));
        assertEquals(2, oss.next(10));
        assertEquals(1, oss.next(10));
        assertEquals(2, oss.next(10));
        assertEquals(3, oss.next(20));
        assertEquals(1, oss.next(20));
        assertEquals(4, oss.next(20));
        assertEquals(5, oss.next(20));
    }

}