package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextMultiplePricesInIncreasingOrderTest {

    @Test
    public void nextMultiplePricesInIncreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(120);
        assertEquals(2, result);
    }

}