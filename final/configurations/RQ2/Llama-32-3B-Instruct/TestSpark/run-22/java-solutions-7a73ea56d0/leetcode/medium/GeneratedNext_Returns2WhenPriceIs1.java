package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedNext_Returns2WhenPriceIs1 {

    @Test
    public void next_Returns2WhenPriceIs1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(true);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(Integer.MIN_VALUE);
        int result = stockSpan.next(1);
        assertEquals(2, result);
    }

}