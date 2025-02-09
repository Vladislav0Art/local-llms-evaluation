package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DecreasingOrderTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_DecreasingOrderTest() {
        int[] prices = {9, 8, 7, 6, 5, 3, 2, 1};
        int[] expected = {1, 1, 1, 2, 2, 3, 4, 5};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}