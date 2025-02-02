package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_WhenNoPreviousPrices_ReturnsCount {

    @Test
    public void next_WhenNoPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);

        assertEquals(1, onlineStockSpan.list.get(0));
    }

}