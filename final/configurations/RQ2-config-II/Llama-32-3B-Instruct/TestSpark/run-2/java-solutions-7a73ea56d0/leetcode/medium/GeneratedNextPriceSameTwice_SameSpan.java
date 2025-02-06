package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceSameTwice_SameSpan {

    @Test
    public void nextPriceSameTwice_SameSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(5);
        onlineStockSpan.next(5);
        int result = onlineStockSpan.next(5);
        assertEquals(1, result);
    }

}