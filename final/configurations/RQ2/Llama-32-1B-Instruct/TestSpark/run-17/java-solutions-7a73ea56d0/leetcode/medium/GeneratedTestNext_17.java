package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_17 {

    @Test
    public void testNext_17() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {17};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(12, onlineStockSpan.next(17));
    }

}