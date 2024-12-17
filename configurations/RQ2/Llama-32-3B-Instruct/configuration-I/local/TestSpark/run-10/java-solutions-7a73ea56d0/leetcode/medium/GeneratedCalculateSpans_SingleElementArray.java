package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray {

    @Test
    public void calculateSpans_SingleElementArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}