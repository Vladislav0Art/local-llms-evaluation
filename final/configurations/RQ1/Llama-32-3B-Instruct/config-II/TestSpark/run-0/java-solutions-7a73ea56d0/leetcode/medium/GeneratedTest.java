package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_PriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        assertEquals(1, solution.list.get(solution.list.size() - 1));
        solution.next(7);
        assertEquals(2, solution.list.get(solution.list.size() - 1));
        solution.next(5);
        assertEquals(3, solution.list.get(solution.list.size() - 1));
    }

    @Test
    public void next_SamePriceMultipleTimesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(10);
        solution.next(10);
        assertEquals(4, solution.list.get(solution.list.size() - 1));
    }

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_SingleElementArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_BasicTestCaseTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 55, 40};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_SpanOfAllElementsIsSameTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 55, 40};
        for (int i : solution.calculateSpans(prices))
            assertTrue(i == solution.list.size());
    }

    @Test
    public void calculateSpans_SpanOfAllElementsIsDifferentTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        for (int i : solution.calculateSpans(prices))
            assertTrue(i != solution.list.size());
    }

    @Test
    public void next_PriceIsLowerThanAllPreviousPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 5};
        solution.next(3);
        assertEquals(2, solution.list.get(solution.list.size() - 1));
    }

    @Test
    public void calculateSpans_SpanOfFirstElementIsAlwaysOneTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        assertArrayEquals(new int[]{1, 2, 3}, solution.calculateSpans(prices));
    }

}