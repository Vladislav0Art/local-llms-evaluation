package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextSinglePriceTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}