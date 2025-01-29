package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_emptyPrices {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_calculateSpans_emptyPrices() {
        int[] prices = new int[]{0};
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{});

        for (int i : onlineStockSpan.calculateSpans(prices)) {
            assertEquals(0, i);
        }
    }

}