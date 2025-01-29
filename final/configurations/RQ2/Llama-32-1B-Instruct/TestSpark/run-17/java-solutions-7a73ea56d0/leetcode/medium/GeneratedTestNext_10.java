package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_10 {

    @Test
    public void testNext_10() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(5, onlineStockSpan.next(10));
    }

}