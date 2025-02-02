package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansForSingleElement {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansForSingleElement() {
        int[] prices = {5};
        int[] expected = {1};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}