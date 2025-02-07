package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage_DuplicatePrices {

    private final OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void testMaxLineCoverage_DuplicatePrices() {
        int[] prices = {1, 2, 2};
        when(instance.next(1)).thenReturn(0);
        when(instance.next(2)).thenReturn(1);

        int[] result = instance.calculateSpans(prices);
        assertEquals(new int[]{0, 1}, result);
    }

}