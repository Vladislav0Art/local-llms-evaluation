package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_ReturnsCorrectCountForSamePrices {

    @Test
    public void next_ReturnsCorrectCountForSamePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        assertEquals(3L, onlineStockSpan.list[0]);
    }

}