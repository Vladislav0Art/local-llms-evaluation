package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maximize_line_coverage_calculateSpans_empty_prices {

    @Test
    public void test_maximize_line_coverage_calculateSpans_empty_prices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(next(1)).thenReturn(-1);

        int[] prices = {};
        int[] expected = {0};
        int result = stock.next(price -> price) + stock.calculateSpans(prices);
        assertEquals(expected.length, result);
    }

}