package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_IntPrice_ReturnsCorrectCount() {
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void next_DifferentPrices_ReturnsCorrectCounts() {
        onlineStockSpan.next(50);
        onlineStockSpan.next(60);
        onlineStockSpan.next(70);
        assertEquals(2, onlineStockSpan.next(60));
        assertEquals(1, onlineStockSpan.next(70));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        int[] prices = {50, 60, 70};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 1}, result);
    }

    @Test
    public void calculateSpans_SamePrices_ReturnsCorrectSpans() {
        int[] prices = {100, 100, 100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{3, 2, 2}, result);
    }

}