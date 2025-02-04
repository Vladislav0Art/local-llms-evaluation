package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_ReturnsExpectedValue_WhenPriceIsLowerThanAllPrevious() {
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void nextPrice_ReturnsExpectedValue_WhenPriceIsEqualToAllPrevious() {
        assertEquals(2, onlineStockSpan.next(100));
        onlineStockSpan.next(100);
    }

    @Test
    public void nextPrice_ReturnsExpectedValue_WhenPriceIsHigherThanAllPrevious() {
        assertEquals(1, onlineStockSpan.next(-70));
    }

    @Test
    public void calculateSpans_SpanValuesAreCorrectForIncreasingPrices_WhenPricesIncrease() {
        int[] prices = {100, 80, 75, 70, 60, 65};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpans_SpanValuesAreCorrectForDecreasingPrices_WhenPricesDecrease() {
        int[] prices = {100, 80, 75, 70, 60, 65};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpans_SpanValuesAreCorrectForMixedPrices_WhenPricesChange() {
        int[] prices = {100, 80, 75, 70, 60};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpans_SpanValuesAreCorrectForAllPrices() {
        int[] prices = {100, 80, 75, 70, 60, 65};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpans_SpanValuesAreCorrectForEmptyPrices() {
        int[] prices = {};
        int[] expectedSpans = {0};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}