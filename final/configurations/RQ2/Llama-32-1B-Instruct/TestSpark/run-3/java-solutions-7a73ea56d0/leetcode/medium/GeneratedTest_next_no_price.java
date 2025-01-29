package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_no_price {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_next_no_price() {
        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        int price = 5;
        int result = onlineStockSpan.next(price);
        assertEquals(-1, result);
    }

}