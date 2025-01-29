package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans_priceNotFound {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_calculateSpans_priceNotFound() {
        int[] prices = new int[]{1, 3, 5};
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{});

        for (int i : onlineStockSpan.calculateSpans(prices)) {
            assertEquals(0, i);
        }
    }

}