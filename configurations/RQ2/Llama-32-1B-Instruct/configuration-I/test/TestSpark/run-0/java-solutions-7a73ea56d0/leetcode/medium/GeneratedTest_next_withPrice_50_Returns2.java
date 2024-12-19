package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_withPrice_50_Returns2 {

    @Test
    public void test_next_withPrice_50_Returns2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(50)).thenReturn(2);
        int result = onlineStockSpan.next(100);
        assertEquals(3, result); // 1 + 2
    }

}