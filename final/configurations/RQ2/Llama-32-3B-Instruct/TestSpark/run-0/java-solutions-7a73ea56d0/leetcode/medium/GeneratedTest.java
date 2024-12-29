package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedTest {

    @Test
    public void next_0Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(1, solution.next(0));
    }

    @Test
    public void next_NegativeNumberTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        assertEquals(-1, solution.next(-1));
    }

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 7, 2};
        int[] expected = {1, 1, 2, 3, 4};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_TwoPeaksTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {5, 7, 6, 8, 3};
        int[] expected = {1, 2, 2, 4, 1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

    @Test
    public void calculateSpans_DownwardsTrendTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {5, 3, 6, 7, 2};
        int[] expected = {1, 1, 3, 4, 1};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}