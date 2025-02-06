package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = new OnlineStockSpan().calculateSpans(prices);
        assertArrayEquals(result,[]);
    }

}