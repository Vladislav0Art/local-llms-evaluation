package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maximize_line_coverage_calculateSpans_all_prices {

    @Test
    public void test_maximize_line_coverage_calculateSpans_all_prices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(next(3)).thenReturn(0);

        int[] prices = {2, 6, 9};
        when(calculateSpans(prices)).thenReturn(new int[]{1, 2, 3});

        int result = stock.next(price -> price) + stock.calculateSpans(prices);
        assertEquals(8, result);
    }

}