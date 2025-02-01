package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextEqualTest {

    @Test
    public void nextEqualTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(20);
        assertEquals(2, span.next(20));
    }

}