package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNextWithEmptyList {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void testNextWithEmptyList() {
        int[] prices = {};
        int[] spans = {};
        onlineStockSpan = new OnlineStockSpan();

        for (int i = 0; i < prices.length; i++) {
            assertEquals(spans[i], onlineStockSpan.next(prices[i]));
        }
    }

}