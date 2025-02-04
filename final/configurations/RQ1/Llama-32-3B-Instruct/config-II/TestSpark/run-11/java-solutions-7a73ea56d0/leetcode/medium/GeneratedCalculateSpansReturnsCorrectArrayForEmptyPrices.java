package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansReturnsCorrectArrayForEmptyPrices {

    @Test
    public void calculateSpansReturnsCorrectArrayForEmptyPrices() {
        int[] prices = {};
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, obj.list.toArray());
    }

}