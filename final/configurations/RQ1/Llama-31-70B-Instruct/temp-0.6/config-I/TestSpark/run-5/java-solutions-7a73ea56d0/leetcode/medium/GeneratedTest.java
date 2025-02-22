package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansEmptyListTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansNullTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = null;
        int[] expected = null;
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansAllSamePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 10, 10};
        int[] expected = {1, 2, 3};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}