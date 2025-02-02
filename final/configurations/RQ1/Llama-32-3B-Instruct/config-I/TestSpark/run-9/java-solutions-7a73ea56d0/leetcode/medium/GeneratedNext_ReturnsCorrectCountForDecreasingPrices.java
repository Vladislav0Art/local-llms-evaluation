package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_ReturnsCorrectCountForDecreasingPrices {

    @Test
    public void next_ReturnsCorrectCountForDecreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 5, 8, 11, 9, 7};
        for (int price : prices) {
            onlineStockSpan.next(price);
        }
        assertEquals(6L, onlineStockSpan.list[0]);
    }

}