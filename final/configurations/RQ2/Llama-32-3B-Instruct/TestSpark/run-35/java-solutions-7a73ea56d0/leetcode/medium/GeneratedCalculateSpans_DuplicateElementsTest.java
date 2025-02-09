package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DuplicateElementsTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_DuplicateElementsTest() {
        int[] prices = {3, 2, 6, 5, 0, 2, 6, 4, 1};
        int[] expected = {2, 1, 4, 2, 1, 1, 2, 1, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}