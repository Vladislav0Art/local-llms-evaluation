package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedCalculateSpansDecreasingSequenceTest {

    @Test
    public void calculateSpansDecreasingSequenceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {30, 25, 20, 15};
        int[] expected = {1, 2, 3, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}