package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void next_PriceZero_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(0));
    }

    @Test
    public void next_PricePositive_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(10));
    }

    @Test
    public void next_PriceNegative_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(-5));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1});
        int[] expected = {1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpans_MultiElementArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 90, 85, 99};
        int[] result = solution.calculateSpans(prices);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpans_IncreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 90, 80, 70, 60};
        int[] result = solution.calculateSpans(prices);
        int[] expected = {1, 3, 5, 8, 12};
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpans_DecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {60, 70, 80, 90, 100};
        int[] result = solution.calculateSpans(prices);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

}