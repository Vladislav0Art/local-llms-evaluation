package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextSingleValueTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(100));
    }

    @Test
    public void nextIncreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(100));
        assertEquals(2, span.next(110));
        assertEquals(3, span.next(120));
    }

    @Test
    public void nextDecreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(120));
        assertEquals(1, span.next(110));
        assertEquals(1, span.next(100));
    }

    @Test
    public void nextMixedValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(100));
        assertEquals(1, span.next(90));
        assertEquals(2, span.next(120));
        assertEquals(1, span.next(60));
        assertEquals(2, span.next(80));
        assertEquals(1, span.next(70));
        assertEquals(6, span.next(160));
    }

    @Test
    public void calculateSpansSingleValueTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100};
        int[] expectedSpans = {1};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

    @Test
    public void calculateSpansIncreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 110, 120};
        int[] expectedSpans = {1, 2, 3};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

    @Test
    public void calculateSpansDecreasingValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {120, 110, 100};
        int[] expectedSpans = {1, 1, 1};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMixedValuesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {100, 90, 120, 60, 80, 70, 160};
        int[] expectedSpans = {1, 1, 2, 1, 2, 1, 6};
        assertArrayEquals(expectedSpans, span.calculateSpans(prices));
    }

}