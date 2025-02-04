package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SinglePriceReturnsOne {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpans_SinglePriceReturnsOne() {
        int[] result = solution.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}