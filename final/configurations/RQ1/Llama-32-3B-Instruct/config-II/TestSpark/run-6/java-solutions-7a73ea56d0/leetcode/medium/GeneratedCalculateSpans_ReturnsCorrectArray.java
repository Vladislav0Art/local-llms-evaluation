package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectArray {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_ReturnsCorrectArray() {
        int[] prices = {100, 80, 75, 60, 55, 65, 70, 85};
        int[] expected = {1, 1, 2, 4, 6, 5, 4, 7};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}