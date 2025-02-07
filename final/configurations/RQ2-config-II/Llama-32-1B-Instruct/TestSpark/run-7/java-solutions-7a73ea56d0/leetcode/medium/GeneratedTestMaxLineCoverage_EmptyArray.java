package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage_EmptyArray {

    private final OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void testMaxLineCoverage_EmptyArray() {
        int[] prices = {};
        when(instance.next(anyInt())).thenReturn(0);

        int[] result = instance.calculateSpans(prices);
        assertEquals(new int[]{}, result);
    }

}