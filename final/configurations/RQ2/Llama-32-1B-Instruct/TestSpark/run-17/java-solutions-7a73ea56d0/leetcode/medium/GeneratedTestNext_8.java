package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_8 {

    @Test
    public void testNext_8() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {8};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(3, onlineStockSpan.next(8));
    }

}