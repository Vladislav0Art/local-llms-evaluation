package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maximize_line_coverage_no_calculateSpans {

    @Test
    public void test_maximize_line_coverage_no_calculateSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        when(next(1)).thenReturn(-1);

        int result = stock.next(price -> price) + stock.calculateSpans(prices);
        assertEquals(4, result);
    }

}