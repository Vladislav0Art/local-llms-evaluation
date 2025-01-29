package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_18 {

    @Test
    public void testNext_18() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {18};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(13, onlineStockSpan.next(18));
    }

}