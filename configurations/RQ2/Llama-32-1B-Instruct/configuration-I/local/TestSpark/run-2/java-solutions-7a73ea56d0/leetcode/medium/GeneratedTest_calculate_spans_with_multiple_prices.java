package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest_calculate_spans_with_multiple_prices {

    @Test
    public void test_calculate_spans_with_multiple_prices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.next(price1)).thenReturn(0);
        when(stockSpan.next(price2)).thenReturn(1);

        int price1 = 1;
        int price2 = 2;
        int[] result = stockSpan.calculateSpans(new int[]{price1, price2});
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

}