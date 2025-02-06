package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1});
        int[] expected = {1};
        assertArrayEquals(expected, result);
    }

}