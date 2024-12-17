package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_calculate_spans_with_prices_equal_to_0 {

    @Test
    public void test_calculate_spans_with_prices_equal_to_0() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(-5)).thenReturn(2);

        int[] prices = {-5};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result.length);
    }

}