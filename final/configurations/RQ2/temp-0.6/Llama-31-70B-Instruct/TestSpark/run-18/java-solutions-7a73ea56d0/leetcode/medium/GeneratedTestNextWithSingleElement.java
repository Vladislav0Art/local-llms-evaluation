package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestNextWithSingleElement {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void testNextWithSingleElement() {
        int[] prices = {100};
        int[] spans = {1};
        onlineStockSpan = new OnlineStockSpan();

        for (int i = 0; i < prices.length; i++) {
            assertEquals(spans[i], onlineStockSpan.next(prices[i]));
        }
    }

}