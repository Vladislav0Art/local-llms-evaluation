package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_calculate_spans_with_empty_price_array {

    @Test
    public void test_calculate_spans_with_empty_price_array() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // Test case for no price array provided
        when(stockSpan.next(5)).thenReturn(1);

        int[] prices = {};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}