package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_withNoPrices_Returns {

    @Test
    public void test_calculateSpans_withNoPrices_Returns() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        when(onlineStockSpan.calculateSpans(new int[]{})).thenReturn(new int[]{0});
        OnlineStockSpan result = onlineStockSpan;
        int[] resultArray = result.calculateSpans(new int[]{});
        assertEquals(resultArray, new int[]{0});
    }

}