package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncrementalTest {

    @Test
    public void nextIncrementalTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        assertEquals(1, span.next(11));
    }

}