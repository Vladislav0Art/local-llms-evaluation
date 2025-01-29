package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_11 {

    @Test
    public void testNext_11() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {11};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(6, onlineStockSpan.next(11));
    }

}