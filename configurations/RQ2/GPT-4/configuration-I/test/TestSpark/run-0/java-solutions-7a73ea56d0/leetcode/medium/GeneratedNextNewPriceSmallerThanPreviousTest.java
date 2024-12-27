package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNextNewPriceSmallerThanPreviousTest {

    @Test
    public void nextNewPriceSmallerThanPreviousTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(99));
    }

}