package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsExpectedResult {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsExpectedResult() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 1, 3, 4, 3}, result);
    }

}