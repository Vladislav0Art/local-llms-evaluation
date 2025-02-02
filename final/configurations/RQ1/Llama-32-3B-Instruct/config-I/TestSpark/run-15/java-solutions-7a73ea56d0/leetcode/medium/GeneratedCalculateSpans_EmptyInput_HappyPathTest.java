package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCalculateSpans_EmptyInput_HappyPathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyInput_HappyPathTest() {
        int[] prices = new int[0];
        int[] expected = {};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}