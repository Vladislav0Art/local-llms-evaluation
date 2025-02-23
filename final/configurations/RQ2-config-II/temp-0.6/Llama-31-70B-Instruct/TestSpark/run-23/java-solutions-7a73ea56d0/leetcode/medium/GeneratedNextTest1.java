package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        assertEquals(1, stockSpan.next(15));
    }

}