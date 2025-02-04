package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_PricesDecreasesConsecutiveCounts {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpans_PricesDecreasesConsecutiveCounts() {
        int[] result = solution.calculateSpans(new int[]{100, 80, 60, 40});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}