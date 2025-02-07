package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTestMaxLineCoverage {

    private final OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void testMaxLineCoverage() {
        int[] prices = {1, 2, 3, 4};
        when(instance.next(1)).thenReturn(0);
        when(instance.next(2)).thenReturn(1);
        when(instance.next(3)).thenReturn(2);
        when(instance.next(4)).thenReturn(3);

        int[] result = instance.calculateSpans(prices);
        assertEquals(new int[]{0, 1, 2, 3}, result);
    }

}