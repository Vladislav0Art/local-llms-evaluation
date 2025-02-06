package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextConsecutivePricesIncrease {

    @Test
    public void nextConsecutivePricesIncrease() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(2, stock.next(100));
        assertEquals(3, stock.next(105));
        assertEquals(4, stock.next(110));
    }

}