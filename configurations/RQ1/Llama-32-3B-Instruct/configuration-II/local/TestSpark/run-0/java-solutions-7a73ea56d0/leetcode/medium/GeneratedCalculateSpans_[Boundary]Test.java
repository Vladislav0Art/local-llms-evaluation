package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[Boundary]

Test {

    @Test
    public void calculateSpans_[ Boundary]Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6, 5};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}