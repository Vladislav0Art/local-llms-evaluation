package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class GeneratedCalculateSpansOneElementTest {

    @Test
    public void calculateSpansOneElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = new int[]{100};
        int[] expected = new int[]{1};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(input));
    }

}