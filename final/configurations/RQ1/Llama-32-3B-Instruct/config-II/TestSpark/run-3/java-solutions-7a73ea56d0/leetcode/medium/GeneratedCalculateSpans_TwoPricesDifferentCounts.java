package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_TwoPricesDifferentCounts {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpans_TwoPricesDifferentCounts() {
        int[] result = solution.calculateSpans(new int[]{100, 80, 60});
        assertArrayEquals(new int[]{2, 3, 4}, result);
    }

}