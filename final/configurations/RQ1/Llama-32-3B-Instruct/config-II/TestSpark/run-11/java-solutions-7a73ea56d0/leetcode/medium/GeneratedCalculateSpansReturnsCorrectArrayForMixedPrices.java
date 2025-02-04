package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansReturnsCorrectArrayForMixedPrices {

    @Test
    public void calculateSpansReturnsCorrectArrayForMixedPrices() {
        int[] prices = {3, 1, 5};
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.calculateSpans(prices);
        assertArrayEquals(new int[]{4, 2, 7}, obj.list.toArray());
    }

}