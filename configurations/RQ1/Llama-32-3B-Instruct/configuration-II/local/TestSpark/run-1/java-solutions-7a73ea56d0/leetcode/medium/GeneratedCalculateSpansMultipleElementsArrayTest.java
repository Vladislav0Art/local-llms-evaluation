package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class GeneratedCalculateSpansMultipleElementsArrayTest {

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 55};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}