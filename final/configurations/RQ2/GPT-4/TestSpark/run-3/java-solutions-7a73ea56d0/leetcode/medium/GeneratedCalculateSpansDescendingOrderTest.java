package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class GeneratedCalculateSpansDescendingOrderTest {

    @Test
    public void calculateSpansDescendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = new int[]{100, 90, 80, 70, 60};
        int[] expected = new int[]{1, 1, 1, 1, 1};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(input));
    }

}