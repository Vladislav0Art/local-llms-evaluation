package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maximize_line_coverage_calculateSpans_all_zero {

    @Test
    public void test_maximize_line_coverage_calculateSpans_all_zero() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(next(1)).thenReturn(-1);

        int[] prices = {0, 0, 0};
        int[] expected = {-1, -1, -1};
        int result = stock.next(price -> price) + stock.calculateSpans(prices);
        assertEquals(expected.length, result);
    }

}