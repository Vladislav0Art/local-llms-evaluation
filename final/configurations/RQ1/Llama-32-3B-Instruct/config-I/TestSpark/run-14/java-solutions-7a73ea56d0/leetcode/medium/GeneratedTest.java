package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceIsOne() {
        stockSpan.next(100);
        assertEquals(1L, (long) stockSpan.list.get(0));
    }

    @Test
    public void nextPriceIncreasesSpan() {
        stockSpan.next(150);
        assertEquals(2L, (long) stockSpan.list.size());
        assertTrue((int) stockSpan.list.get(0) > 100);
        assertEquals(-1L, (long) stockSpan.next(50));
    }

    @Test
    public void nextPriceDecreasesSpan() {
        stockSpan.next(50);
        assertEquals(2L, (long) stockSpan.list.size());
        assertTrue((int) stockSpan.list.get(0) > 100);
        assertEquals(-1L, (long) stockSpan.next(150));
    }

    @Test
    public void nextPriceIsSameAsPrevious() {
        stockSpan.next(100);
        stockSpan.next(100);
        assertEquals(2L, (long) stockSpan.list.size());
        assertTrue((int) stockSpan.list.get(0) > 99 && (int) stockSpan.list.get(1) > 100);
        assertEquals(-1L, (long) stockSpan.next(100));
    }

    @Test
    public void calculateSpansForSingleElement() {
        int[] prices = {5};
        int[] expected = {1};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansForMultipleElements() {
        int[] prices = {10, 4, 3, 6, 2};
        int[] expected = {1, 1, 2, 3, 2};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansForDescendingOrder() {
        int[] prices = {6, 5, 4, 3, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}