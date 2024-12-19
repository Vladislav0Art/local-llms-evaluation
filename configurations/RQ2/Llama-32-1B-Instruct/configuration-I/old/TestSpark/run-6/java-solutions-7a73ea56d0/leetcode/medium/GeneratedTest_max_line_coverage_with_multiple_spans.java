package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_max_line_coverage_with_multiple_spans {

    private int[] prices = {0, 100, 200, 300};
    private int[][] spans = new int[][]{
            {10},
            {20}
    };

    @Test
    public void test_max_line_coverage_with_multiple_spans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        when(instance.next(9)).thenReturn(spans[0][1]);
        verifyAll().next(2).thenTimes(3).thenTimes(4);
        assertArrayEquals(new int[]{12, 8, 4}, instance.calculateSpans(prices));
    }

}