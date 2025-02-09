package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementTest() {
        int[] prices = {3};
        int[] expected = {1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}