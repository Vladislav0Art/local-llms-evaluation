package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedCalculateSpans_ConsecutiveNumbers {

    @Test
    public void calculateSpans_ConsecutiveNumbers() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = solution.calculateSpans(prices);
        for (int i = 0; i < result.length; i++) {
            assertEquals(i + 1, result[i]);
        }
    }

}