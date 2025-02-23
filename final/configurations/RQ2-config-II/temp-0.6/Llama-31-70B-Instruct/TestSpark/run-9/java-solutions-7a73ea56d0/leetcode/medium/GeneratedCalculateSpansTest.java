package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 5, 3, 20, 25};
        int[] expectedSpans = new int[]{1, 2, 1, 1, 1};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}