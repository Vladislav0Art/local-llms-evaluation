package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class GeneratedCalculateSpansAscendingOrderTest {

    @Test
    public void calculateSpansAscendingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = new int[]{60, 70, 80, 90, 100};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, onlineStockSpan.calculateSpans(input));
    }

}