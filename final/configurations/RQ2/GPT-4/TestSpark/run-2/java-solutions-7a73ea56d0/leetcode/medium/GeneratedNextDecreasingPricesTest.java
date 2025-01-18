package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecreasingPricesTest {

    @Test
    public void nextDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(1, stockSpan.next(90));
        assertEquals(1, stockSpan.next(80));
        assertEquals(1, stockSpan.next(70));
        assertEquals(1, stockSpan.next(60));
    }

}