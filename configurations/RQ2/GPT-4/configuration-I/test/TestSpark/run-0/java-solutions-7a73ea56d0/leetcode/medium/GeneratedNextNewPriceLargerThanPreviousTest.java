package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNextNewPriceLargerThanPreviousTest {

    @Test
    public void nextNewPriceLargerThanPreviousTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(101));
    }

}