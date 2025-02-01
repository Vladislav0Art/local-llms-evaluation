package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextNewPriceLargerThanLastTest {

    @Test
    public void nextNewPriceLargerThanLastTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(1, stockSpan.next(15));
    }

}