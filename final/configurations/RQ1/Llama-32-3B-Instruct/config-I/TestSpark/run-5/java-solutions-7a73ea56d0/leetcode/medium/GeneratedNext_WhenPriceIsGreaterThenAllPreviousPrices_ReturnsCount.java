package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_WhenPriceIsGreaterThenAllPreviousPrices_ReturnsCount {

    @Test
    public void next_WhenPriceIsGreaterThenAllPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(70);

        assertEquals(3, onlineStockSpan.list.get(2));
    }

}