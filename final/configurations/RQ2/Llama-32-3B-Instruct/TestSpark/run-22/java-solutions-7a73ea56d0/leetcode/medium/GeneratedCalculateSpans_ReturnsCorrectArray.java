package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSpans_ReturnsCorrectArray {

    @Test
    public void calculateSpans_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60, 70};
        when(stockSpan.stack.isEmpty()).thenReturn(true);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(0);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2, 3, 4, 5}, result);
    }

}