package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextWithPreviousHigherPriceTest {

    @Test
    public void nextWithPreviousHigherPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(9));
        assertEquals(1, onlineStockSpan.next(11));
    }

}