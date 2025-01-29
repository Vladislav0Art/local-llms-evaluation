package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void test_next_1() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int result = solver.next(1);
        assertEquals(1, result);
    }

    @Test
    public void test_next_2() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int result = solver.next(2);
        assertEquals(0, result);
    }

    @Test
    public void test_calculateSpans_single_element() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] result = solver.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_calculateSpans_multiple_elements() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10, 22, 9, 33, 21, 50, 41, 60};
        int[] expected = {1, 2, 4, 3, 2, 5, 6};
        int[] result = solver.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test_calculateSpans_large_prices() {
        OnlineStockSpan solver = new OnlineStockSpan();
        int[] prices = {10000, 20000, 30000};
        int[] expected = {1, 2, 4};
        int[] result = solver.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

}