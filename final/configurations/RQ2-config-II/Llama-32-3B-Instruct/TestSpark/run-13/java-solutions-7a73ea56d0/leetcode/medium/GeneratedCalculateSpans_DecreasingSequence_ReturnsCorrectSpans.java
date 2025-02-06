package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedCalculateSpans_DecreasingSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {60, 70, 80, 90, 100};
        int[] result = solution.calculateSpans(prices);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

}