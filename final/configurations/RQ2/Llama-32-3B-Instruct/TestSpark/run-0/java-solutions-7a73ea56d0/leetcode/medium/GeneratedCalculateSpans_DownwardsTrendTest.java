package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_DownwardsTrendTest {

    @Test
    public void calculateSpans_DownwardsTrendTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {5, 3, 6, 7, 2};
        int[] expected = {1, 1, 3, 4, 1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}