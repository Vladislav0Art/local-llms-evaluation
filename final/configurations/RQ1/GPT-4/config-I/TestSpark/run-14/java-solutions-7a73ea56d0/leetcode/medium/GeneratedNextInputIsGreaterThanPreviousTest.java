package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextInputIsGreaterThanPreviousTest {

    @Test
    public void nextInputIsGreaterThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        int result = span.next(20);
        assertEquals(1, result);
    }

}