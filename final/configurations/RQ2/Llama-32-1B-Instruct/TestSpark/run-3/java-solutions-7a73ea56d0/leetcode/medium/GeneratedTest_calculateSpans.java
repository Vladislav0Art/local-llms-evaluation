package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest_calculateSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void test_calculateSpans() {
        int[] prices = new int[]{3, 2, 6, -0.8, 1.4, 5};
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(new int[]{2, 1, 1, 2, 3});

        for (int i : onlineStockSpan.calculateSpans(prices)) {
            assertEquals(i, 0); // index 0 has price of -1
        }
    }

}