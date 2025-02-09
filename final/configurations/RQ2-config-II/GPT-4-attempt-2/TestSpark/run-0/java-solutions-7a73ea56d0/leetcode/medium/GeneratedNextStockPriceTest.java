package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextStockPriceTest {

    @Test
    public void nextStockPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(1, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(2, onlineStockSpan.next(70));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(4, onlineStockSpan.next(75));
        assertEquals(6, onlineStockSpan.next(85));
    }

}