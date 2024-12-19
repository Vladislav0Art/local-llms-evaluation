package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_max_line_coverage_empty_prices {

    private int[] prices = {0, 100, 200, 300};
    private int[][] spans = new int[][]{
            {10},
            {20}
    };

    @Test
    public void test_max_line_coverage_empty_prices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        when(instance.next(0)).thenReturn(prices[0]);
        verifyAll().next(0).thenTimes(1);
        assertArrayEquals(new int[]{prices[0]}, instance.calculateSpans(prices));
    }

}