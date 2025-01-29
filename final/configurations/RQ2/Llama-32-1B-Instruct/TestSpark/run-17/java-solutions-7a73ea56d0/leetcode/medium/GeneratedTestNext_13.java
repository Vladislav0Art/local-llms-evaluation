package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_13 {

    @Test
    public void testNext_13() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {13};
        Mockito.when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{1});
        assertEquals(8, onlineStockSpan.next(13));
    }

}