package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyPricesArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

}