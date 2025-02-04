package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansReturnsCorrectArrayForEmptyPricesWhenStackIsEmpty {

    @Test
    public void calculateSpansReturnsCorrectArrayForEmptyPricesWhenStackIsEmpty() {
        int[] prices = {};
        Stack<Integer> stack = new Stack<>();
        OnlineStockSpan obj = new OnlineStockSpan();
        obj.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, obj.list.toArray());
    }

}