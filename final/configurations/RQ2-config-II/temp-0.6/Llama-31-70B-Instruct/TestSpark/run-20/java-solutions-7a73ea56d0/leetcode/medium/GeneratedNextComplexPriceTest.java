package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextComplexPriceTest {

    @Test
    public void nextComplexPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        stockSpan.next(2);
        stockSpan.next(3);
        int result = stockSpan.next(4);
        assertEquals(1, result);
    }

}