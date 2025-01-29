package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_12 {

    @Test
    public void testNext_12() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {12};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(7, onlineStockSpan.next(12));
    }

}