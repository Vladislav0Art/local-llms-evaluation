package leetcode.medium;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedNextMultipleSamePriceTest {

    @Test
    public void nextMultipleSamePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result1 = onlineStockSpan.next(100);
        int result2 = onlineStockSpan.next(100);
        int result3 = onlineStockSpan.next(100);
        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
    }

}