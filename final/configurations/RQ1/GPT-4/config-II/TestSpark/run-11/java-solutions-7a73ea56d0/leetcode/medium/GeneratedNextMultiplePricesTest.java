package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        assertEquals(1, onlineStockSpan.next(120));
    }

}