package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[]{}, result);
    }

}