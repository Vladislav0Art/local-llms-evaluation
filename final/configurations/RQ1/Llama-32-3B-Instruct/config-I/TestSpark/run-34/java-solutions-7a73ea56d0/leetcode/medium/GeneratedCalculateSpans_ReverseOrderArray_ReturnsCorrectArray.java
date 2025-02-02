package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_ReverseOrderArray_ReturnsCorrectArray {

    @Test
    public void calculateSpans_ReverseOrderArray_ReturnsCorrectArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1, 4, 3, 5, 2};
        int[] result = solution.calculateSpans(prices);
        assertEquals(2, result[0]);
    }

}