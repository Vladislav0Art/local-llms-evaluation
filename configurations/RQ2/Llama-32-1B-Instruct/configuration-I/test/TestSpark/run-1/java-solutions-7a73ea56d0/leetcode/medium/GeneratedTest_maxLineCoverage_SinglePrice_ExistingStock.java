package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_maxLineCoverage_SinglePrice_ExistingStock {

    @Test
    public void test_maxLineCoverage_SinglePrice_ExistingStock() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1};
        int[][] expectedSpans = {{0}};

        // Mocking the next method
        StockSpan mockNext = mock(OnlineStockSpan.class);
        when(mockNext.next(1)).thenReturn(0);

        int actualSpans[] = stock.calculateSpans(prices);
        for (int i = 0; i < prices.length - 1; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}