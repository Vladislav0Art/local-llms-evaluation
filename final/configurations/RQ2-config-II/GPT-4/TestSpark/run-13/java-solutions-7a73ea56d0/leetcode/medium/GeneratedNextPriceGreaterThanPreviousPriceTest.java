package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceGreaterThanPreviousPriceTest {

    @Test
    public void nextPriceGreaterThanPreviousPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(120);
        assertEquals(2, result);
    }

}