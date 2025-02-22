package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyListTest {

    @Test
    public void calculateSpansEmptyListTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}