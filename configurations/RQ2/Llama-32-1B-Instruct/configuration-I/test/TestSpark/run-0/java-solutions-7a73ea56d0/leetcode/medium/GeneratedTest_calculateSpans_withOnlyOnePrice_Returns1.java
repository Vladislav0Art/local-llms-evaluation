package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_withOnlyOnePrice_Returns1 {

    @Test
    public void test_calculateSpans_withOnlyOnePrice_Returns1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next()).thenReturn(1);
        int[] prices = new int[]{100};
        onlineStockSpan.setPrices(prices);
        int result = onlineStockSpan.calculateSpans(new int[]{});
        assertEquals(2, result); // [1, 0] (assuming the first price is 100)
    }

}