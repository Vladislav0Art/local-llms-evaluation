package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_TwoPeaksTest {

    @Test
    public void calculateSpans_TwoPeaksTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {5, 7, 6, 8, 3};
        int[] expected = {1, 2, 2, 4, 1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}