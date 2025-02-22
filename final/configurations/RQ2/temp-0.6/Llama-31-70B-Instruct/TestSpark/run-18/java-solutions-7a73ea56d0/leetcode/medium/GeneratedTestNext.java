package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNext {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void testNext() {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = {1, 1, 1, 2, 1, 4, 6};
        onlineStockSpan = new OnlineStockSpan();

        for (int i = 0; i < prices.length; i++) {
            assertEquals(spans[i], onlineStockSpan.next(prices[i]));
        }
    }

}