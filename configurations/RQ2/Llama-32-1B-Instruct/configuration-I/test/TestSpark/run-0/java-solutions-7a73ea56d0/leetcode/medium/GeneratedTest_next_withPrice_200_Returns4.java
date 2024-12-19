package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_withPrice_200_Returns4 {

    @Test
    public void test_next_withPrice_200_Returns4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next(200)).thenReturn(5);
        int result = onlineStockSpan.next(1000);
        assertEquals(10, result); // 1 + 2 + 4
    }

}