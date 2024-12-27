package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextInputPriceInIncreasingOrderTest {

    @Test
    public void nextInputPriceInIncreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(21);
        assertEquals(1, result);
    }

}