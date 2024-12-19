package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maximize_line_coverage {

    @Test
    public void test_maximize_line_coverage() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {3, 6, 2, 9};
        when(next(1)).thenReturn(0);
        when(next(2)).thenReturn(0);
        when(next(3)).thenReturn(-1);

        int result = stock.next(price -> price) + stock.calculateSpans(prices);
        assertEquals(10, result);
    }

}