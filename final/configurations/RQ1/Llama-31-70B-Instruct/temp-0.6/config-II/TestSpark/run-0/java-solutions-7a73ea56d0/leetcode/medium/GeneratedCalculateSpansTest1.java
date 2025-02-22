package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest1 {

    @Test
    public void calculateSpansTest1() {
        int[] prices = new int[]{10, 20, 5, 70, 60, 20, 15};
        int[] expected = new int[]{1, 2, 1, 6, 4, 1, 1};

        OnlineStockSpan stock = new OnlineStockSpan();
        int[] actual = stock.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}