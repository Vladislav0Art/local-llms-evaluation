package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceEqualToCurrentTest {

    @Test
    public void nextPriceEqualToCurrentTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(100));
    }

}