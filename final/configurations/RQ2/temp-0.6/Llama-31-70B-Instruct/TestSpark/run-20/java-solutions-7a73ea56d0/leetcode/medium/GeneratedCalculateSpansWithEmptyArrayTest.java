package leetcode.medium;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithEmptyArrayTest {

    @Test
    public void calculateSpansWithEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}