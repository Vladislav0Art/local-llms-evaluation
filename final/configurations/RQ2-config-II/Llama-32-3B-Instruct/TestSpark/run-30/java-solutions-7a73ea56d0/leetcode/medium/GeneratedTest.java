package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void nextPriceZeroTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void nextPriceNegativeOneTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(-1);
        assertEquals(2, result);
    }

    @Test
    public void nextPriceMultipleTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-1, -0, 0};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertTrue(result > 0);
        }
    }

    @Test
    public void nextPriceNegativeMultipleTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-1, -2, -3};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertTrue(result > 0);
        }
    }

    @Test
    public void nextPriceMultipleIncreaseThenDecreaseTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 1};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertTrue(result > 0);
        }
    }

    @Test
    public void nextPriceMultipleDecreaseThenIncreaseTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        for (int price : prices) {
            int result = onlineStockSpan.next(price);
            assertTrue(result > 0);
        }
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {1};
        int[] expected = {1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 1, 4, 5};
        int[] expected = {1, 1, 2, 3, 4};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}