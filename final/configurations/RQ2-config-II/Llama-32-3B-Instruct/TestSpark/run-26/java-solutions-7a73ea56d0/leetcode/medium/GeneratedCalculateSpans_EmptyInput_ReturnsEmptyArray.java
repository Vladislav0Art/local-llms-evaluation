package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyInput_ReturnsEmptyArray {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}