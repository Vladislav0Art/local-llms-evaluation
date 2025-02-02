package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    @Test
    public void next_SingleElement_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void next_DuplicateElements_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(30);
        onlineStockSpan.next(30);
        int result = onlineStockSpan.next(30);
        assertEquals(2, result);
    }

    @Test
    public void next_IncreasingSequence_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(1);
        onlineStockSpan.next(3);
        onlineStockSpan.next(5);
        int result = onlineStockSpan.next(2);
        assertEquals(1, result);
    }

    @Test
    public void next_DecreasingSequence_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(5);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        int result = onlineStockSpan.next(6);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpans_SingleElement_ReturnsOne() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_DuplicateElements_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 30, 30, 40};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
        assertEquals(1, result[3]);
    }

    @Test
    public void calculateSpans_IncreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 30, 50, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void calculateSpans_DecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {60, 50, 40, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

    @Test
    public void calculateSpans_EmptyArray_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(new int[0]));
    }

}