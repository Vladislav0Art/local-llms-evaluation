package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_EmptyArray_ReturnsZeroArray {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsZeroArray() {
        int[] prices = new int[0];
        int[] result = instance.calculateSpans(prices);
        assertEquals(0, result.length); // max coverage of line: price - first price + current index
    }

}