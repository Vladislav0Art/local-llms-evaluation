package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest3 {

    @Test
    public void nextTest3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(1, onlineStockSpan.next(5));
    }

}