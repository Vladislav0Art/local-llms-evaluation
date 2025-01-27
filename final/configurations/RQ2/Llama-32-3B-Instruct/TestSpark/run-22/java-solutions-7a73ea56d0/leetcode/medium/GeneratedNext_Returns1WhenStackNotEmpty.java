package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedNext_Returns1WhenStackNotEmpty {

    @Test
    public void next_Returns1WhenStackNotEmpty() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(1);
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

}