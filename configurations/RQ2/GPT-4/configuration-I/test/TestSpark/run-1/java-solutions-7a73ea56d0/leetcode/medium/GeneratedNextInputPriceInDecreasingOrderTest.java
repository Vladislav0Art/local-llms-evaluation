package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextInputPriceInDecreasingOrderTest {

    @Test
    public void nextInputPriceInDecreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(19);
        assertEquals(1, result);
    }

}