package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_WhenPriceIsLessThanAllPreviousPrices_ReturnsCount {

    @Test
    public void next_WhenPriceIsLessThanAllPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(70);
        onlineStockSpan.next(60);

        assertEquals(4, onlineStockSpan.list.get(0));
    }

}