package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextSimplePriceTest {

    @Test
    public void nextSimplePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        int result = stockSpan.next(2);
        assertEquals(1, result);
    }

}