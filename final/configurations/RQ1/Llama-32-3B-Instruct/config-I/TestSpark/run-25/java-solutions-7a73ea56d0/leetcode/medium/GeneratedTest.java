package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_SinglePrice_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void next_LowestPrice_ReturnsZero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(50);
        assertEquals(0, result);
    }

    @Test
    public void calculateSpans_SimpleCase_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 76, 73};
        int[] expectedSpans = {1, 2, 4, 6};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 76, 73, 100};
        int[] expectedSpans = {1, 2, 4, 6, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

    @Test
    public void calculateSpans_LowestPriceAtFirst_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 50};
        int[] expectedSpans = {1, 2, 3};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

    @Test
    public void next_MockStackReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.pop()).thenReturn(0);
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpans_MockStackReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.pop()).thenReturn(0);
        int[] prices = {100};
        int[] expectedSpans = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

}