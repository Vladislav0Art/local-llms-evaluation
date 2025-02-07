package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestCalculateSpans_NoPrices {

    @Test
    public void testCalculateSpans_NoPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {};
        when(calculateSpans(prices)).thenReturn(new int[]{});
        assertArrayEquals(new int[]{}, instance.calculateSpans(prices));
    }

}