package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void nextNewPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void nextIncreasingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(200));
    }

    @Test
    public void nextDecreasingPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(200);
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void nextSamePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(100));
    }

    @Test
    public void calculateSpansEmptyInputTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertEquals(0, onlineStockSpan.calculateSpans(prices).length);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        assertArrayEquals(new int[]{1}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 200, 300, 400, 500};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansDecreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {500, 400, 300, 200, 100};
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, onlineStockSpan.calculateSpans(prices));
    }

}