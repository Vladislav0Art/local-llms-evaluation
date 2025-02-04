package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_SamePrice_ReturnsOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        assertEquals(1, stockSpan.next(100));
    }

    @Test
    public void next_LowerPriceThanFirstAddToStack_AddToStackAndReturnCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(90);
        stockSpan.next(100);
        assertEquals(2, stockSpan.next(100));
    }

    @Test
    public void next_HigherPriceThanLastAddToStack_ReturnsCorrectCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        stockSpan.next(90);
        assertEquals(3, stockSpan.next(90));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertNotNull(result);
        assertTrue(result.length == 0);
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = stockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 90, 75, 60};
        int[] result = stockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertEquals(4, result.length);
    }

    @Test
    public void calculateSpans_PricesAreSorted_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 90, 75, 60};
        int[] result = stockSpan.calculateSpans(prices);
        assertNotNull(result);
        assertEquals(4, result.length);
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                assertTrue(result[i] >= result[i - 1]);
            }
        }
    }

}