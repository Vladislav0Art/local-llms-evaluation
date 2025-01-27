package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceWithMultipleSpansTest {

    @Test
    public void nextPriceWithMultipleSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        stockSpan.next(75);
        assertEquals(4, stockSpan.next(60));
    }

}