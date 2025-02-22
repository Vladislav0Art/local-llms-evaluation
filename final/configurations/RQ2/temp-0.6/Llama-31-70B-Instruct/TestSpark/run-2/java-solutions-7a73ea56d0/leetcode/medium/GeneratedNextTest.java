package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
        assertEquals(2, onlineStockSpan.next(20));
        assertEquals(1, onlineStockSpan.next(5));
    }

}