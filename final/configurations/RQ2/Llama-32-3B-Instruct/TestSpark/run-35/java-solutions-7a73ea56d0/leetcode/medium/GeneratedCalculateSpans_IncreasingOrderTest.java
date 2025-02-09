package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_IncreasingOrderTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_IncreasingOrderTest() {
        int[] prices = {1, 3, 6, 7, 8, 9};
        int[] expected = {1, 2, 4, 5, 6, 7};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}