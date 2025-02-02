package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansOneElementReturnsCorrectSpan {

    @Test
    public void calculateSpansOneElementReturnsCorrectSpan() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{1, 1}, result);
    }

}