package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(80));
        assertEquals(3, onlineStockSpan.next(60));
        assertEquals(4, onlineStockSpan.next(70));
        assertEquals(1, onlineStockSpan.next(120));
    }

}