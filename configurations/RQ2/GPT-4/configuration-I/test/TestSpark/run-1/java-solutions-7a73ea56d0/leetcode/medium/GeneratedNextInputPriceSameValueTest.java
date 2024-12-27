package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedNextInputPriceSameValueTest {

    @Test
    public void nextInputPriceSameValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(20);
        assertEquals(1, result);
    }

}