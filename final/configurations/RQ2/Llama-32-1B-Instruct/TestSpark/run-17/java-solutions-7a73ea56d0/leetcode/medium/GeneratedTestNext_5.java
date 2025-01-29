package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_5 {

    @Test
    public void testNext_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(3, onlineStockSpan.next(5));
    }

}