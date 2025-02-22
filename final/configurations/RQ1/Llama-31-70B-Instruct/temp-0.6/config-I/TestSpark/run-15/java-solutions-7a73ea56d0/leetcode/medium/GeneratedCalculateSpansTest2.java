package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest2 {

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 2, 1};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = stock.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}