package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_SamePrice_ReturnsZero() {
        assertEquals(0, stockSpan.next(10));
    }

    @Test
    public void next_LowerPrice_ReturnsOne() {
        assertEquals(1, stockSpan.next(5));
    }

    @Test
    public void next_HigherPrice_ReturnsCorrectCount() {
        assertEquals(2, stockSpan.next(15)); // [10, 11, 12] span: 3
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertArrayEquals(result, new int[0]);
    }

    @Test
    public void calculateSpans_SingleElement_ReturnsOne() {
        int[] result = stockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(result, new int[]{1});
    }

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 8, 9, 7, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectCount() {
        int[] prices = {10, 8, 9, 7, 6};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(2, result[1]); // [8, 9] span: 2
    }

    @Test
    public void calculateSpans_LowerPrices_ReturnsCorrectSpans() {
        int[] prices = {5, 4, 3};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[]{1, 2, 3});
    }

    @Test
    public void calculateSpans_LowerPrices_Duplicate_ReturnsCorrectCount() {
        int[] prices = {5, 4, 4, 3};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(3, result[1]); // [5, 4] span: 2
    }

}