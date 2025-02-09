package leetcode.medium;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

public class GeneratedNextMultipleDifferentPriceTest {

    @Test
    public void nextMultipleDifferentPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result1 = onlineStockSpan.next(100);
        int result2 = onlineStockSpan.next(80);
        int result3 = onlineStockSpan.next(120);
        int result4 = onlineStockSpan.next(90);
        assertEquals(1, result1);
        assertEquals(1, result2);
        assertEquals(3, result3);
        assertEquals(1, result4);
    }

}