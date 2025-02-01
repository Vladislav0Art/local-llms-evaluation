package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextAllPricesEqualTest {

    @Test
    public void nextAllPricesEqualTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(30);
        stockSpan.next(30);
        assertEquals(3, stockSpan.next(30));
    }

}