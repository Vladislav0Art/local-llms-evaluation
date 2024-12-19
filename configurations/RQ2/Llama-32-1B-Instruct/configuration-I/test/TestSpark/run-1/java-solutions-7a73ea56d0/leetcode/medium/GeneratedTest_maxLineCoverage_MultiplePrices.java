package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest_maxLineCoverage_MultiplePrices {

    @Test
    public void test_maxLineCoverage_MultiplePrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2};
        int[][] expectedSpans = {{3}, {4}};

        // Mocking the next method
        StockSpan mockNext = mock(OnlineStockSpan.class);
        when(mockNext.next(0)).thenReturn(0);
        when(mockNext.next(1)).thenReturn(3);
        when(mockNext.next(2)).thenReturn(4);

        int actualSpans[] = stock.calculateSpans(prices);
        for (int i = 0; i < prices.length - 1; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

    public int calculateSpans(int[] prices) {
        int[][] spans = new int[prices.length][];

        // Calculate the span of each stock
        for (int i = 0; i < prices.length - 1; i++) {
            spans[i] = new int[]{i + 1, prices[i] + prices[i + 1] + 1};
        }

        return spans;
    }

}