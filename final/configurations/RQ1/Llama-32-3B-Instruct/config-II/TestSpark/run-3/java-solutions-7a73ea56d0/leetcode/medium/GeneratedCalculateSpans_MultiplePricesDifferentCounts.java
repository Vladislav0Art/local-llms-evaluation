package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultiplePricesDifferentCounts {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultiplePricesDifferentCounts() {
        int[] result = solution.calculateSpans(new int[]{10, 20, 30, 40, 50});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}