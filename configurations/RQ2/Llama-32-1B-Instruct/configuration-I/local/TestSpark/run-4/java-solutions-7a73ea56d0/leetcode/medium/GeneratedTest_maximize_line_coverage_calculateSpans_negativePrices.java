package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_maximize_line_coverage_calculateSpans_negativePrices {

    @Test
    public void test_maximize_line_coverage_calculateSpans_negativePrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        when(next(3)).thenReturn(-1);

        int[] prices = {2};
        int result = stock.next(price -> price) + stock.calculateSpans(prices);
        assertEquals(0, result);
    }

}