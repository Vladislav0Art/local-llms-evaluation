package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextWithIncreasingPricesTest {

    @Test
    public void nextWithIncreasingPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(50));
        assertEquals(2, span.next(100));
        assertEquals(3, span.next(200));
        assertEquals(4, span.next(300));
    }

}