package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class GeneratedNextIncreasingPricesTest {

    @Test
    public void nextIncreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(2, onlineStockSpan.next(200));
        assertEquals(3, onlineStockSpan.next(300));
    }

}