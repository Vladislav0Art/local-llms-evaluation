package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpansTest() {
        MockitoAnnotations.initMocks(this);
        int[] prices = {1, 2, 3};
        int[] expected = {1, 2, 3};
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansNullTest() {
        MockitoAnnotations.initMocks(this);
        int[] prices = null;
        int[] expected = null;
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansEmptyTest() {
        MockitoAnnotations.initMocks(this);
        int[] prices = new int[0];
        int[] expected = new int[0];
        when(onlineStockSpan.calculateSpans(prices)).thenReturn(expected);
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expected, result);
    }

    @Test
    public void nextTest() {
        MockitoAnnotations.initMocks(this);
        int price = 10;
        int expected = 1;
        when(onlineStockSpan.next(price)).thenReturn(expected);
        int result = onlineStockSpan.next(price);
        assertEquals(expected, result);
    }

}