package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectResult {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{1}, result);
    }

}