package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(80);
        assertEquals(1, result);
    }

}