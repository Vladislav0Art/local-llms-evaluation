package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_SingleDayPrice_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        assertEquals(1, result);
    }

    @Test
    public void next_MultipleDaysPrices_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(150);
        solution.next(20);
        int[] result = solution.calculateSpans(new int[]{100, 150, 20});
        assertEquals(new int[]{1, 2, 0}, result);
    }

    @Test
    public void next_DuplicatePrices_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(10);
        solution.next(15);
        int[] result = solution.calculateSpans(new int[]{10, 10, 15});
        assertEquals(new int[]{1, 1, 0}, result);
    }

    @Test
    public void calculateSpans_EmptyPricesArray_ReturnsEmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpans_SinglePriceArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{10});
        assertEquals(new int[]{1}, result);
    }

}