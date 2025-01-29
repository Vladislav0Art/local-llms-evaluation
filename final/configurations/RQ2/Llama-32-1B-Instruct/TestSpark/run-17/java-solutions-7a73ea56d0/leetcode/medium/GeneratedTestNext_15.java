package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_15 {

    @Test
    public void testNext_15() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {15};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(10, onlineStockSpan.next(15));
    }

}