package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(10);
        assertEquals(1, result);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            int result = solution.next(price);
            assertEquals(1, result); // initial value
        }
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {0};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] expected = {1, 2, 1, 3, 2, 1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansDuplicatePriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] expected = {1, 2, 1, 3, 4, 1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        int[] expected = {1, 1, 1, 1, 1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansAlternatingPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6};
        int[] expected = {1, 1, 2, 3, 4};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansConsecutivePricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7, 6};
        int[] expected = {1, 1, 2, 3, 4};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansNullPriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int price = null;
        try {
            solution.next(price);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}