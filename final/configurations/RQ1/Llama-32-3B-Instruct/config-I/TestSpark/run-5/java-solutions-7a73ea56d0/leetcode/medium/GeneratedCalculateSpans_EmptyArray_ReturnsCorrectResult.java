package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArray_ReturnsCorrectResult {

    @Test
    public void calculateSpans_EmptyArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{0}, result);
    }

}