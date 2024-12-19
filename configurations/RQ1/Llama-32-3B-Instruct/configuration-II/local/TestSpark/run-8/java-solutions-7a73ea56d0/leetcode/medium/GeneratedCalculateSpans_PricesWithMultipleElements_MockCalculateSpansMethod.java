package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_PricesWithMultipleElements_MockCalculateSpansMethod {

    @Test
    public void calculateSpans_PricesWithMultipleElements_MockCalculateSpansMethod() {
        OnlineStockSpan solution = new OnlineStockSpan();
        when(solution.calculateSpans(anyInt[]())).thenReturn(new int[]{2, 1, 1, 1});
        int[] prices = {10, 9, 8, 7};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(result, new int[]{2, 1, 1, 1});
    }

}