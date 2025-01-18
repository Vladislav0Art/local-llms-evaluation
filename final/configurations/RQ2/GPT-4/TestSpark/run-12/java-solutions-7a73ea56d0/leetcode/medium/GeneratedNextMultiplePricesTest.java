package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(90);
        span.next(80);
        int result = span.next(70);
        assertEquals(1, result);
    }

}