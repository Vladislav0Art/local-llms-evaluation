package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void next_Returns1WhenPriceIs0() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void next_Returns2WhenPriceIs1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(true);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(Integer.MIN_VALUE);
        int result = stockSpan.next(1);
        assertEquals(2, result);
    }

    @Test
    public void next_Returns1WhenStackNotEmpty() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(1);
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpans_ReturnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60, 70};
        when(stockSpan.stack.isEmpty()).thenReturn(true);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(0);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpans_SpanIncreases() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(1);
        int[] prices = {100, 80, 75, 70, 60, 70};
        when(stockSpan.next(anyInt())).thenReturn(1);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

    @Test
    public void calculateSpans_SpanDoesNotIncrease() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(100);
        int[] prices = {100, 80, 75, 70, 60, 70};
        when(stockSpan.next(anyInt())).thenReturn(1);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

    @Test
    public void calculateSpans_SpanDecreases() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(1);
        int[] prices = {100, 80, 75, 70, 60};
        when(stockSpan.next(anyInt())).thenReturn(2);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2, 3, 4}, result);
    }

    @Test
    public void calculateSpans_SpanDecreasesToZero() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(1);
        int[] prices = {100, 80, 75, 70};
        when(stockSpan.next(anyInt())).thenReturn(2);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 1, 2, 3}, result);
    }

    @Test
    public void calculateSpans_SpanDoesNotDecrease() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.isEmpty()).thenReturn(false);
        when(stockSpan.previousHighestPrice(anyInt())).thenReturn(100);
        int[] prices = {100, 80, 75, 70};
        when(stockSpan.next(anyInt())).thenReturn(2);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void next_ThrowsNullPointerExceptionWhenStackIsNotEmpty() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        when(stockSpan.stack.get(0)).thenReturn(100);
        assertThrows(NPointerException.class, stockSpan::next);
    }

}