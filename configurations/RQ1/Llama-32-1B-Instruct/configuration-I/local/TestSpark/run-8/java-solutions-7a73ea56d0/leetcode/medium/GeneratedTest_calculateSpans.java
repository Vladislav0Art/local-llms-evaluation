package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans {

    @Test
    public void test_calculateSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {7, 6, 5, 4, 3, 2};
        when(list.add(anyInt())).thenReturn(0);
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.calculateSpans(prices);
        verifyAll();

        list = new ArrayList<>();
        prices = new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80};
        when(list.add(anyInt())).thenReturn(0);
        onlineStockSpan.list = new ArrayList<>();
        onlineStockSpan.calculateSpans(prices);
        verifyAll();

        assertEquals(new int[]{1, 2, 3, 4, 5}, list.stream().mapToInt(Integer::intValue).toArray());
    }

}