package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedNextPriceIsGreaterThanAllPreviousPricesTest {

    @Test
    public void nextPriceIsGreaterThanAllPreviousPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(110));
        assertEquals(3, onlineStockSpan.next(120));
    }

}