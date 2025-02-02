package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpans_MultipleDecreasing_ReturnsCorrectArray {

    @Test
    public void calculateSpans_MultipleDecreasing_ReturnsCorrectArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{10, 7, 5, 3});
        assertArrayEquals(new int[]{1, 2, 2, 4}, result);
    }

}