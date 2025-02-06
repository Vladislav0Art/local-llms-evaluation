package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextConsecutivePricesNoChange {

    @Test
    public void nextConsecutivePricesNoChange() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(100));
        assertEquals(1, stock.next(100));
    }

}