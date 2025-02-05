package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecreasingPricesTest {

    @Test
    public void nextDecreasingPricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(300);
        stockSpan.next(200);
        int actual = stockSpan.next(100);
        assertEquals(1, actual);
    }

}