package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_19 {

    @Test
    public void testNext_19() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(19);
        Mockito.when(onlineStockSpan.calculateSpans(new int[]{19})).thenReturn(new int[]{1});
        assertEquals(3, result);
    }

}