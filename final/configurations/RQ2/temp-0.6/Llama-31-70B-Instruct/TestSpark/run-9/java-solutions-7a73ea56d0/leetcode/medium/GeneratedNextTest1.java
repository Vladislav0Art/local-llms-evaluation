package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(100));
    }

}