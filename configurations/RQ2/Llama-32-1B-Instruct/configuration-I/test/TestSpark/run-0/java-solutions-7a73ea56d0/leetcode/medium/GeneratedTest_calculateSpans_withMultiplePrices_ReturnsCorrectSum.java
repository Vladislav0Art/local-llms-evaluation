package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_withMultiplePrices_ReturnsCorrectSum {

    @Test
    public void test_calculateSpans_withMultiplePrices_ReturnsCorrectSum() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.next()).thenReturn(2);
        onlineStockSpan.setPrices(new int[]{50, 150});
        int result = onlineStockSpan.calculateSpans(new int[]{});
        assertEquals(3, result); // [2, 1] (assuming the last price is 150)
    }

}