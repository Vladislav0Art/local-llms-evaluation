package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_PricesWithOneElement_GivenArrayCorrect {

    @Test
    public void calculateSpans_PricesWithOneElement_GivenArrayCorrect() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = solution.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}