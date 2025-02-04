package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArrayTest {

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}