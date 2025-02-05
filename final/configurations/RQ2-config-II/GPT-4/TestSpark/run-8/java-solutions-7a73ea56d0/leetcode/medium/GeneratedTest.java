package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextNormalValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void nextNegativeValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            stockSpan.next(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Price can not be negative", e.getMessage());
        }
    }

    @Test
    public void nextZeroValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansNullArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            stockSpan.calculateSpans(null);
        } catch (NullPointerException e) {
            assertEquals("Prices array cannot be null", e.getMessage());
        }
    }

    @Test
    public void calculateSpansNormalArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, result);
    }

    @Test
    public void calculateSpansNegativeValuesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            int[] prices = {100, -1, 60, 70, 60, 75, 85};
            stockSpan.calculateSpans(prices);
        } catch (IllegalArgumentException e) {
            assertEquals("Price can not be negative", e.getMessage());
        }
    }

}