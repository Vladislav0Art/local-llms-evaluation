package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedNext_ThrowsNullPointerExceptionWhenStackIsNotEmpty {

    @Test
    public void next_ThrowsNullPointerExceptionWhenStackIsNotEmpty() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.get(0)).thenReturn(100);
        assertThrows(NPointerException.class, stockSpan::next);
    }

}