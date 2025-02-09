package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(80);
        int result = stockSpan.next(90);
        assertEquals(2, result);
    }

}