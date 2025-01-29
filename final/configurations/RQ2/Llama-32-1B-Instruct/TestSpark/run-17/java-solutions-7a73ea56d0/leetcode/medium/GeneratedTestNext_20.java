package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_20 {

    @Test
    public void testNext_20() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(20);
        Mockito.when(onlineStockSpan.calculateSpans(new int[]{20})).thenReturn(new int[]{1});
        assertEquals(4, result);
    }

}