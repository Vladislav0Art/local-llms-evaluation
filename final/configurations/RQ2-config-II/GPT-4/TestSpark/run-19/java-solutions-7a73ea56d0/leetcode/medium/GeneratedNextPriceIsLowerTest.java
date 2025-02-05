package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceIsLowerTest {

    @Test
    public void nextPriceIsLowerTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(200);
        int result = stockSpan.next(100);
        assertEquals(1, result);
    }

}