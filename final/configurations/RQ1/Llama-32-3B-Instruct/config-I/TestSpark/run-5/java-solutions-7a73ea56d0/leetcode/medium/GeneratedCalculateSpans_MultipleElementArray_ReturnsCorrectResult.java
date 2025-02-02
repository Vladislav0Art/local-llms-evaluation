package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementArray_ReturnsCorrectResult {

    @Test
    public void calculateSpans_MultipleElementArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 70, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}