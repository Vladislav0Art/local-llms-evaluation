package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceEqualsPreviousPriceTest {

    @Test
    public void nextPriceEqualsPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(100));
    }

}