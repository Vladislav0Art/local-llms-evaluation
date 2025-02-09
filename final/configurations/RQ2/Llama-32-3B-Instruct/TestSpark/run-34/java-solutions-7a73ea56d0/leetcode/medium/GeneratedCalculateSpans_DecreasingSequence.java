package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedCalculateSpans_DecreasingSequence {

    @Test
    public void calculateSpans_DecreasingSequence() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {40, 30, 20};
        int[] result = solution.calculateSpans(prices);
        assertTrue(result.length == 3);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
    }

}