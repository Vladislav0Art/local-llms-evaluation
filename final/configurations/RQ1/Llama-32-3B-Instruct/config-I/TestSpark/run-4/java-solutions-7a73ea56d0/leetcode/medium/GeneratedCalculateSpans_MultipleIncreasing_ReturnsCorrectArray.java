package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpans_MultipleIncreasing_ReturnsCorrectArray {

    @Test
    public void calculateSpans_MultipleIncreasing_ReturnsCorrectArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{10, 8, 6});
        assertArrayEquals(new int[]{2, 1, 1}, result);
    }

}