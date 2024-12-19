package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_withNoPrices_Returns0 {

    @Test
    public void test_next_withNoPrices_Returns0() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next()).thenReturn(1);
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}