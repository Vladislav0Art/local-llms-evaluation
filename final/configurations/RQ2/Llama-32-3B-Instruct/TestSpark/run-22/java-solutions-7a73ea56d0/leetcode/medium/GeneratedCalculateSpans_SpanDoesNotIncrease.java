package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedCalculateSpans_SpanDoesNotIncrease {

    @Test
    public void calculateSpans_SpanDoesNotIncrease() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(100);
        int[] prices = {100, 80, 75, 70, 60, 70};
        when(stockSpan.next(anyInt())).thenReturn(1);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

}