package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansForMultipleElements {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansForMultipleElements() {
        int[] prices = {10, 4, 3, 6, 2};
        int[] expected = {1, 1, 2, 3, 2};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}