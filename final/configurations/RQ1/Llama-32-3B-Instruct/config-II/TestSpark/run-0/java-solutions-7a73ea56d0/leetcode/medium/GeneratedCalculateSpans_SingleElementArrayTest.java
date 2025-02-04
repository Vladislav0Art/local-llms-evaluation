package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementArrayTest {

    @Test
    public void calculateSpans_SingleElementArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}