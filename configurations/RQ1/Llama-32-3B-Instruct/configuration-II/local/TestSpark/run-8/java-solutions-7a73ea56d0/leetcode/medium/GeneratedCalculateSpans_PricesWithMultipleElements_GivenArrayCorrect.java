package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_PricesWithMultipleElements_GivenArrayCorrect {

    @Test
    public void calculateSpans_PricesWithMultipleElements_GivenArrayCorrect() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 1, 1}, result);
    }

}