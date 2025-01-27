package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSpans_SpanDoesNotDecrease {

    @Test
    public void calculateSpans_SpanDoesNotDecrease() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(100);
        int[] prices = {100, 80, 75, 70};
        when(stockSpan.next(anyInt())).thenReturn(2);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

}