package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansNullTest {

    @Test
    public void calculateSpansNullTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = null;
        int[] expected = null;
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}