package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextInputIsEqualThanPreviousTest {

    @Test
    public void nextInputIsEqualThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        int result = span.next(10);
        assertEquals(2, result);
    }

}