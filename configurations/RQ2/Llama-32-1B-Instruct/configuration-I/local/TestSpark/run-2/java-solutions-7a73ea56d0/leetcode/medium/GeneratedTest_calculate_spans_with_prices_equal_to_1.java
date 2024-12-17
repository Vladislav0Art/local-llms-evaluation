package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_calculate_spans_with_prices_equal_to_1 {

    @Test
    public void test_calculate_spans_with_prices_equal_to_1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(-5)).thenReturn(2);

        int[] prices = {-5};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}