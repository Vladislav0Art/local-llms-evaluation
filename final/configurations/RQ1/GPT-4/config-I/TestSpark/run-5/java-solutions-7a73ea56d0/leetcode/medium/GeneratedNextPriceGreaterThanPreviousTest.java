package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextPriceGreaterThanPreviousTest {

    @Test
    public void nextPriceGreaterThanPreviousTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(80);
        int result = stockSpan.next(100);
        assertEquals(2, result);
    }

}