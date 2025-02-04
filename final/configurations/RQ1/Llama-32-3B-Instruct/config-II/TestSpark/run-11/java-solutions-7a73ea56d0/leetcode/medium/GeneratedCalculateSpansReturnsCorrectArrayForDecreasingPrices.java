package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansReturnsCorrectArrayForDecreasingPrices {

    @Test
    public void calculateSpansReturnsCorrectArrayForDecreasingPrices() {
        int[] prices = {3, 2, 1};
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.calculateSpans(prices);
        assertArrayEquals(new int[]{4, 2, 1}, obj.list.toArray());
    }

}