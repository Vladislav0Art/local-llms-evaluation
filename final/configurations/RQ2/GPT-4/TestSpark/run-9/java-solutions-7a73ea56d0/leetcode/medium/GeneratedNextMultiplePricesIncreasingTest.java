package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesIncreasingTest {

    @Test
    public void nextMultiplePricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(110);
        int result = onlineStockSpan.next(120);
        assertEquals(3, result);
    }

}