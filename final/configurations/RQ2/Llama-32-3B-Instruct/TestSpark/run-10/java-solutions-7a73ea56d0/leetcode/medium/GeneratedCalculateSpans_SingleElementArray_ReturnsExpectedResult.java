package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsExpectedResult {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsExpectedResult() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}