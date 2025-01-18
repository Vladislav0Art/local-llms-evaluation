package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecreasingPricesTest {

    @Test
    public void nextDecreasingPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(80);
        span.next(60);
        span.next(40);
        assertEquals(1, span.next(20));
    }

}