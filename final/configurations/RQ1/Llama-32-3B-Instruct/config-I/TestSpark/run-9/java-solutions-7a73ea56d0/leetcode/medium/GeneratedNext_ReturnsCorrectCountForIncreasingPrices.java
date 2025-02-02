package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_ReturnsCorrectCountForIncreasingPrices {

    @Test
    public void next_ReturnsCorrectCountForIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        assertEquals(1L, onlineStockSpan.list[0]);
    }

}