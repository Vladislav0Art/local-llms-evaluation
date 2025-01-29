package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_7 {

    @Test
    public void testNext_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(7);
        Mockito.when(onlineStockSpan.calculateSpans(new int[]{7})).thenReturn(new int[]{1});
        assertEquals(2, result);
    }

}