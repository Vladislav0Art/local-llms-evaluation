package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        assertEquals(1, oss.next(10));
        assertEquals(2, oss.next(20));
        assertEquals(1, oss.next(5));
    }

}