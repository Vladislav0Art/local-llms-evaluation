package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_BasicTestCaseTest {

    @Test
    public void calculateSpans_BasicTestCaseTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 55, 40};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}