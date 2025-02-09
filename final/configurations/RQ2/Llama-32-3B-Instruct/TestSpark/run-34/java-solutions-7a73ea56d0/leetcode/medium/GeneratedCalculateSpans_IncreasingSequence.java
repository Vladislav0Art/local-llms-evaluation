package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedCalculateSpans_IncreasingSequence {

    @Test
    public void calculateSpans_IncreasingSequence() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[] result = solution.calculateSpans(prices);
        assertTrue(result.length == 4);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

}