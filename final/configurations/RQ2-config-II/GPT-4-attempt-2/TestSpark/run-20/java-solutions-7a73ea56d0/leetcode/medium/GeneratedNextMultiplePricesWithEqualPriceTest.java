package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesWithEqualPriceTest {

    @Test
    public void nextMultiplePricesWithEqualPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(100);
        assertEquals(2, result);
    }

}