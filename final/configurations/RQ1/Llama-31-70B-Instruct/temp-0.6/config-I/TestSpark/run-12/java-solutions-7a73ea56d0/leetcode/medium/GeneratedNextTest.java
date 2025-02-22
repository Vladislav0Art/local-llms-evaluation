package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(1));
        assertEquals(1, onlineStockSpan.next(2));
        assertEquals(1, onlineStockSpan.next(3));
    }

}