package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_PricesIncreasesConsecutiveCounts {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpans_PricesIncreasesConsecutiveCounts() {
        int[] result = solution.calculateSpans(new int[]{10, 8, 6, 4});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}