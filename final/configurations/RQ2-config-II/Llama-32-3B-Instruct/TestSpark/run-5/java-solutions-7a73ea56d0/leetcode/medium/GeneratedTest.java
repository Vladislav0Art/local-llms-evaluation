package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void nextPrice_EmptyArray_ReturnsZero() {
        List<Integer> prices = new ArrayList<>();
        int result = OnlineStockSpan().next(0);
        assertEquals(0, result);
    }

    @Test
    public void nextPrice_SingleElementArray_ReturnsOne() {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        int result = OnlineStockSpan().next(5);
        assertEquals(1, result);
    }

    @Test
    public void nextPrice_MultipleElementsArray_ReturnsCorrectValue() {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(8);
        prices.add(9);
        int result = OnlineStockSpan().next(5);
        assertEquals(2, result);
    }

    @Test
    public void nextPrice_MultipleElementsArray_ReturnsCorrectValueAgain() {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        prices.add(8);
        prices.add(9);
        prices.add(7);
        int result = OnlineStockSpan().next(6);
        assertEquals(2, result);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = OnlineStockSpan().calculateSpans(new int[0]);
        assertTrue(result.length == 0);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectValue() {
        int[] prices = {10};
        int[] result = OnlineStockSpan().calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectValues() {
        int[] prices = {10, 8, 9, 7};
        int[] result = OnlineStockSpan().calculateSpans(prices);
        assertTrue(result.length == 4);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(1, result[3]);
    }

}