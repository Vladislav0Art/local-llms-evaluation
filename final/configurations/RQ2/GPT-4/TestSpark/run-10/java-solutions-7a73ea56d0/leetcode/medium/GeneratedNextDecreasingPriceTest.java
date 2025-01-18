package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedNextDecreasingPriceTest {

    @Test
    public void nextDecreasingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(200);
        assertEquals(1, onlineStockSpan.next(100));
    }

}