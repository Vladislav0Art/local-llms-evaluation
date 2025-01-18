package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class GeneratedNextNewPriceTest {

    @Test
    public void nextNewPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(1, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(1, onlineStockSpan.next(70));
        assertEquals(2, onlineStockSpan.next(60));
        assertEquals(1, onlineStockSpan.next(75));
        assertEquals(4, onlineStockSpan.next(85));
    }

}