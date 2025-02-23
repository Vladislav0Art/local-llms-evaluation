package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextTest_whenListSizeIsZero {

    @Test
    public void nextTest_whenListSizeIsZero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

}