package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedNextSmallerPriceTest {

    @Test
    public void nextSmallerPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(90);
        assertEquals(2, result);
    }

}