package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceGreaterThanCurrentTest {

    @Test
    public void nextPriceGreaterThanCurrentTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(120));
    }

}