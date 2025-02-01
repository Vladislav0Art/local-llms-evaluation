package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextNewPriceSmallerThanLastTest {

    @Test
    public void nextNewPriceSmallerThanLastTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(20);
        assertEquals(2, stockSpan.next(10));
    }

}