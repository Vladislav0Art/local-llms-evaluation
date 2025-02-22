package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans {

    @Test
    public void calculateSpans() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, obj.calculateSpans(prices));
    }

}