package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCalculateSpans_SingleElementInput_HappyPathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementInput_HappyPathTest() {
        int[] prices = {100};
        int[] expected = {1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}