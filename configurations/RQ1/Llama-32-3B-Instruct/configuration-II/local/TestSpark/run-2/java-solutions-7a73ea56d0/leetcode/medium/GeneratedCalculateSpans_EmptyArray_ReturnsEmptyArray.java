package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = {};
        assertArrayEquals(new int[]{}, onlineStockSpan.calculateSpans(prices));
    }

}