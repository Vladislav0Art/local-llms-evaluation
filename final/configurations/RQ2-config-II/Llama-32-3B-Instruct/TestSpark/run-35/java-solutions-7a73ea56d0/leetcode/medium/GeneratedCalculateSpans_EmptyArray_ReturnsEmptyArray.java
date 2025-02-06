package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = new int[0];
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[0], result);
    }

}