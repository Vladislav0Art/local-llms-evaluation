package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansForDescendingOrder {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansForDescendingOrder() {
        int[] prices = {6, 5, 4, 3, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}