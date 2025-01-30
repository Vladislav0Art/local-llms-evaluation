package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextInputIsLessThanPreviousTest {

    @Test
    public void nextInputIsLessThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        int result = span.next(5);
        assertEquals(1, result);
    }

}