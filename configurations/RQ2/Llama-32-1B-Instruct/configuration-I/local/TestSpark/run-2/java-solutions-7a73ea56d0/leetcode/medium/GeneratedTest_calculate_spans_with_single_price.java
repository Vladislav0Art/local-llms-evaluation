package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_calculate_spans_with_single_price {

    @Test
    public void test_calculate_spans_with_single_price() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(price)).thenReturn(0);

        int price = 1;
        int[] result = stockSpan.calculateSpans(new int[]{price});
        assertEquals(1, result[0]);
    }

}