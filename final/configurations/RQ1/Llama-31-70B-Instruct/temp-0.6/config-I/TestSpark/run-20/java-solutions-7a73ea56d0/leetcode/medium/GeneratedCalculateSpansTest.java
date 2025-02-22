package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 20, 15, 5};
        int[] expectedSpans = new int[]{1, 2, 1, 4};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}