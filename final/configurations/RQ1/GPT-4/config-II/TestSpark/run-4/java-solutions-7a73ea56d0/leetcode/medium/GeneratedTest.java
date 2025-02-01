package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextPriceLowerThanPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(1, onlineStockSpan.next(80));
    }

    @Test
    public void nextPriceEqualPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(100));
    }

    @Test
    public void nextPriceHigherThanPreviousTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(1, onlineStockSpan.next(120));
    }

    @Test
    public void calculateSpansAllPricesEqualTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, spans);
    }

    @Test
    public void calculateSpansAllPricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {80, 90, 100, 110};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, spans);
    }

    @Test
    public void calculateSpansAllPricesDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {110, 100, 90, 80};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1}, spans);
    }

    @Test
    public void calculateSpansMixedPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, spans);
    }

    @Test
    public void calculateSpansEmptyPriceArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{}, spans);
    }

}