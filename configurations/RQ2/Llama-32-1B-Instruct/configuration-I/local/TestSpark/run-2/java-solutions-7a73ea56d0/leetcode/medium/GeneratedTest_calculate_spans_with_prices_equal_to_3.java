package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_calculate_spans_with_prices_equal_to_3 {

    @Test
    public void test_calculate_spans_with_prices_equal_to_3() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(-10)).thenReturn(4);

        int[] prices = {-5};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result.length);
    }

}