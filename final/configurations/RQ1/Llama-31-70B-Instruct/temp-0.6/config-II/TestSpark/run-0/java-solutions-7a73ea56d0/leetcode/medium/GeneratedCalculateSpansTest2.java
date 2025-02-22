package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        int[] prices = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 1, 1, 1, 1};

        OnlineStockSpan stock = new OnlineStockSpan();
        int[] actual = stock.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}