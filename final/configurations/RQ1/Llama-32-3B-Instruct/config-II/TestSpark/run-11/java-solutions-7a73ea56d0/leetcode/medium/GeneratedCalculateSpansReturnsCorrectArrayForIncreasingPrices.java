package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansReturnsCorrectArrayForIncreasingPrices {

    @Test
    public void calculateSpansReturnsCorrectArrayForIncreasingPrices() {
        int[] prices = {1, 2, 3};
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 4}, obj.list.toArray());
    }

}