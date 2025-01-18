package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class GeneratedCalculateSpansMixedOrderTest {

    @Test
    public void calculateSpansMixedOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = new int[]{100, 60, 70, 60, 75, 85};
        int[] expected = new int[]{1, 1, 2, 1, 2, 4};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(input));
    }

}