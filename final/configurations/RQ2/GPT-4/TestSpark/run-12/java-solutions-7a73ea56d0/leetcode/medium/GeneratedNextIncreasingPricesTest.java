package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncreasingPricesTest {

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(120);
        span.next(140);
        int result = span.next(160);
        assertEquals(4, result);
    }

}