package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_maxLineCoverage {

    @Test
    public void test_maxLineCoverage() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[][] expectedSpans = {{1}, {4}, {7}};

        // Mocking the next method
        StockSpan mockNext = mock(OnlineStockSpan.class);
        when(mockNext.next(0)).thenReturn(0);
        when(mockNext.next(1)).thenReturn(1);
        when(mockNext.next(2)).thenReturn(4);

        int actualSpans[] = stock.calculateSpans(prices);
        for (int i = 0; i < prices.length - 1; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}