package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next_one_price {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_next_one_price() {
        List<Integer> prices = new ArrayList<>();
        prices.add(4);
        prices.add(3);
        prices.add(2);
        prices.add(0);
        prices.add(3);
        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        int result = onlineStockSpan.next(4);
        assertEquals(-1, result);

        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        result = onlineStockSpan.next(5);
        assertEquals(-1, result);

        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        result = onlineStockSpan.next(2);
        assertEquals(-1, result);

        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        result = onlineStockSpan.next(0);
        assertEquals(-1, result);

        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        result = onlineStockSpan.next(3);
        assertEquals(-1, result);

        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        result = onlineStockSpan.next(3);
        assertEquals(-1, result);

        when(onlineStockSpan.next(anyInt())).thenReturn(-1);
        result = onlineStockSpan.next(2);
        assertEquals(-1, result);
    }

}