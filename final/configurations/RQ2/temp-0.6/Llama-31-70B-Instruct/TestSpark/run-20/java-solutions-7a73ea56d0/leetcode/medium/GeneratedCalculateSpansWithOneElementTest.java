package leetcode.medium;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithOneElementTest {

    @Test
    public void calculateSpansWithOneElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] expected = {1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}