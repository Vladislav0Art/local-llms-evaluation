package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_1 {

    @Test
    public void testNext_1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        Mockito.when(onlineStockSpan.calculateSpans(new int[]{100})).thenReturn(new int[]{1});
        assertEquals(2, result);
    }

}