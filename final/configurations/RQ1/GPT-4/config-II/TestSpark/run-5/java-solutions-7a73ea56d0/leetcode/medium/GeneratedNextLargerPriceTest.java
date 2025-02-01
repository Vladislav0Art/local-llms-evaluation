package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedNextLargerPriceTest {

    @Test
    public void nextLargerPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(110);
        assertEquals(1, result);
    }

}