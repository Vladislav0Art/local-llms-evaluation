package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextPrice_SingleElementArray {

    @Test
    public void nextPrice_SingleElementArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}