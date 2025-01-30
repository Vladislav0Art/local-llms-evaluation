package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextInputIsGreaterThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        int result = span.next(20);
        assertEquals(1, result);
    }

    @Test
    public void nextInputIsLessThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        int result = span.next(5);
        assertEquals(1, result);
    }

    @Test
    public void nextInputIsEqualThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        int result = span.next(10);
        assertEquals(2, result);
    }

    @Test
    public void calculateSpansDifferentPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansAllPricesSameTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {5, 5, 5, 5, 5, 5, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansOnlyOnePriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {5};
        int[] expected = {1};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

}