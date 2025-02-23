package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextTest_whenListSizeIsTwo {

    @Test
    public void nextTest_whenListSizeIsTwo() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(15);
        assertEquals(1, result);
    }

}