package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_GivenIncreasingPrices_ReturnsIncrementalCounts {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_GivenIncreasingPrices_ReturnsIncrementalCounts() {
        int price = 90;
        onlineStockSpan.next(80);
        onlineStockSpan.next(70);
        onlineStockSpan.next(60);
        assertEquals(3, onlineStockSpan.next(price));
    }

}