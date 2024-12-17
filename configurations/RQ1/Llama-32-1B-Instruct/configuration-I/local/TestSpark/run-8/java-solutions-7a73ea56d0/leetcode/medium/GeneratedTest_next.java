package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_next {

    @Test
    public void test_next() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 7, 6, 4, 3, 2};
        when(list.add(anyInt())).thenReturn(0);
        onlineStockSpan.next(prices[0]);
        assertEquals(2, onlineStockSpan.list.size());

        list = new ArrayList<>();
        prices = new int[]{3, 2, 6, 5, 0, 1};
        when(list.add(anyInt())).thenReturn(0);
        onlineStockSpan.next(prices[0]);
        assertEquals(4, onlineStockSpan.list.size());
    }

}