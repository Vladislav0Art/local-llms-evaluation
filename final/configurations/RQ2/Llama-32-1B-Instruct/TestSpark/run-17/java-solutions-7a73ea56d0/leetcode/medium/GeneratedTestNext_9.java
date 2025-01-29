package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_9 {

    @Test
    public void testNext_9() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {9};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(4, onlineStockSpan.next(9));
    }

}