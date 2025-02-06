package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextHighestPriceWithSpan {

    @Test
    public void nextHighestPriceWithSpan() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(2, stock.next(100));
        assertEquals(1, stock.next(80));
    }

}