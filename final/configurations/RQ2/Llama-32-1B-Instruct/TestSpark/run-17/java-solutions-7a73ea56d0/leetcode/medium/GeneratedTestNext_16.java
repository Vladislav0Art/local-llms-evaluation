package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_16 {

    @Test
    public void testNext_16() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {16};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(11, onlineStockSpan.next(16));
    }

}