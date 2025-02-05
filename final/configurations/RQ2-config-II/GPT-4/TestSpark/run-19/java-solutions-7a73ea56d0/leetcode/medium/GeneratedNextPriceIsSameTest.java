package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextPriceIsSameTest {

    @Test
    public void nextPriceIsSameTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(200);
        int result = stockSpan.next(200);
        assertEquals(2, result);
    }

}