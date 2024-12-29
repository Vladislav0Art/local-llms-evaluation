package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextFirstCallTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int result = spanner.next(100);
        assertEquals(1, result);
    }

    @Test
    public void nextPriceIncreasingTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(80);
        int result = spanner.next(100);
        assertEquals(2, result);
    }

    @Test
    public void nextPriceDecreasingTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        int result = spanner.next(80);
        assertEquals(1, result);
    }

    @Test
    public void nextPriceEqualTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        int result = spanner.next(100);
        assertEquals(2, result);
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] result = spanner.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{100};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansIncreasingPriceTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{100, 200, 300, 400, 500};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpansDecreasingPriceTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{500, 400, 300, 200, 100};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

    @Test
    public void calculateSpansEqualPriceTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] prices = new int[]{100, 100, 100, 100, 100};
        int[] result = spanner.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}