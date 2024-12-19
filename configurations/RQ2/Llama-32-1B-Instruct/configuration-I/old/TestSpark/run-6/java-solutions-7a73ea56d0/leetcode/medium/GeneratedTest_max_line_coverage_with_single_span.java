package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_max_line_coverage_with_single_span {

    private int[] prices = {0, 100, 200, 300};
    private int[][] spans = new int[][]{
            {10},
            {20}
    };

    @Test
    public void test_max_line_coverage_with_single_span() {
        OnlineStockSpan instance = new OnlineStockSpan();
        when(instance.next(1)).thenReturn(spans[0][0]);
        verifyAll().next(0).thenTimes(1);
        assertArrayEquals(new int[]{1}, instance.calculateSpans(prices));
    }

}