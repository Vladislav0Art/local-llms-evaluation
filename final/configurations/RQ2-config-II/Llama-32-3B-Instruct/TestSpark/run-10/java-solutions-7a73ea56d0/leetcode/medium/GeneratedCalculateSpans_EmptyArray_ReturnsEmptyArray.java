package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{});
        assertEquals(new int[]{}, result);
    }

}