package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DuplicatePricesArray_ReturnsCorrectArray {

    @Test
    public void calculateSpans_DuplicatePricesArray_ReturnsCorrectArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1, 1, 1};
        int[] result = solution.calculateSpans(prices);
        assertEquals(2, result[0]);
    }

}