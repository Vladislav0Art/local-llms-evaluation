package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DiverseElementsTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_DiverseElementsTest() {
        int[] prices = {3, 2, 6, 5, 0, 2};
        int[] expected = {2, 1, 4, 2, 1, 1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}