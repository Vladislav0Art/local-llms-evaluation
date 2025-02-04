package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SpanOfFirstElementIsAlwaysOneTest {

    @Test
    public void calculateSpans_SpanOfFirstElementIsAlwaysOneTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        assertArrayEquals(new int[]{1, 2, 3}, solution.calculateSpans(prices));
    }

}