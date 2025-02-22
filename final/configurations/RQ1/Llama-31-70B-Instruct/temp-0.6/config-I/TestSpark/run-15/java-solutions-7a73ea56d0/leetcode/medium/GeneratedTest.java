package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int result = stock.next(1);
        assertEquals(1, result);
    }

    @Test
    public void nextTest2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(1);
        int result = stock.next(2);
        assertEquals(1, result);
    }

    @Test
    public void nextTest3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(1);
        stock.next(2);
        int result = stock.next(3);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = stock.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 2, 1};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = stock.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansTest3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 4, 5
        }

    }