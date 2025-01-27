package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_NothingReturn() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(0, stockSpan.next(0));
    }

    @Test
    public void next_SingleElementPrice() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(1, stockSpan.next(10));
    }

    @Test
    public void next_DuplicatePrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(2, stockSpan.next(10));
    }

    @Test
    public void calculateSpans_EmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertArrayEquals(result, new int[0]);
    }

    @Test
    public void calculateSpans_SingleElementPrice() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_DuplicatePrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 10};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 1}, result);
    }

    @Test
    public void calculateSpans_DuplicatePricesAndDecrease() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 8, 12};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}