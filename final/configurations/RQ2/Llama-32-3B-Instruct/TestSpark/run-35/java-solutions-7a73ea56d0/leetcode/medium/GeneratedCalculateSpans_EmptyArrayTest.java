package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArrayTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArrayTest() {
        int[] prices = {};
        int[] expected = new int[0];
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}