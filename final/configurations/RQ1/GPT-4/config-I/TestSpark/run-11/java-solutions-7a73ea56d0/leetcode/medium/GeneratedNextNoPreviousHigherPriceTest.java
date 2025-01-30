package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextNoPreviousHigherPriceTest {

    @Test
    public void nextNoPreviousHigherPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(10));
        assertEquals(3, onlineStockSpan.next(5));
        assertEquals(1, onlineStockSpan.next(11));
    }

}