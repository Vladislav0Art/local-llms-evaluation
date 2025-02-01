package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextWithDecreasingPricesTest {

    @Test
    public void nextWithDecreasingPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(300));
        assertEquals(1, span.next(200));
        assertEquals(1, span.next(100));
        assertEquals(1, span.next(50));
    }

}