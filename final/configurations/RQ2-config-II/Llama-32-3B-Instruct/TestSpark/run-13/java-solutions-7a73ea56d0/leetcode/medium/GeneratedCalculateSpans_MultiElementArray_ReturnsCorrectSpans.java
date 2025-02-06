package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedCalculateSpans_MultiElementArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultiElementArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 90, 85, 99};
        int[] result = solution.calculateSpans(prices);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, result);
    }

}