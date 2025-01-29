package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_14 {

    @Test
    public void testNext_14() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {14};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(9, onlineStockSpan.next(14));
    }

}