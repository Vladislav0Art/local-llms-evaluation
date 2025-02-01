package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecrementalTest {

    @Test
    public void nextDecrementalTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        assertEquals(2, span.next(50));
    }

}