package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_max_line_coverage_all_prices {

    private int[] prices = {0, 100, 200, 300};
    private int[][] spans = new int[][]{
            {10},
            {20}
    };

    @Test
    public void test_max_line_coverage_all_prices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        when(instance.next(3)).thenReturn(spans[2][0]);
        verifyAll().next(1).thenTimes(1).thenTimes(1).thenTimes(1);
        assertArrayEquals(new int[]{12, 8, 4}, instance.calculateSpans(prices));
    }

}