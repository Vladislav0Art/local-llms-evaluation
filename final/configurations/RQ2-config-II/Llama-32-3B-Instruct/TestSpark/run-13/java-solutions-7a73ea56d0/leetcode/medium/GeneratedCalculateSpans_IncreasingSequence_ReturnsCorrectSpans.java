package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedCalculateSpans_IncreasingSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_IncreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 90, 80, 70, 60};
        int[] result = solution.calculateSpans(prices);
        int[] expected = {1, 3, 5, 8, 12};
        assertArrayEquals(expected, result);
    }

}