package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceLessThanCurrentTest {

    @Test
    public void nextPriceLessThanCurrentTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(80));
    }

}