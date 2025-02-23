package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextTest_whenListSizeIsOne {

    @Test
    public void nextTest_whenListSizeIsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(20);
        assertEquals(2, result);
    }

}