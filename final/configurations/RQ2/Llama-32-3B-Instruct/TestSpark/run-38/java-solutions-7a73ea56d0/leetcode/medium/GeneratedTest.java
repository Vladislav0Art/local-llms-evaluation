package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedTest {

    @Test
    public void next_0_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(0));
    }

    @Test
    public void next_PositivePrice_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(100));
    }

    @Test
    public void next_NegativePrice_Returns1() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(-50));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsWithOneElement() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_PricesAreEqual_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_PricesAreNegative_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {-100, -80, -75, -70, -60};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_PricesAreNegativeAndThenPositive_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {-100, -80, -75, 50};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}