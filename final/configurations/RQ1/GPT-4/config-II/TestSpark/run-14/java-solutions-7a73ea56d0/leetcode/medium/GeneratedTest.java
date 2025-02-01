package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextFirstElementTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        assertEquals(1, span.next(1));
    }

    @Test
    public void nextIncrementalTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(10);
        assertEquals(1, span.next(11));
    }

    @Test
    public void nextEqualTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(20);
        assertEquals(2, span.next(20));
    }

    @Test
    public void nextDecrementalTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        assertEquals(2, span.next(50));
    }

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{25});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansIncrementalArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    public void calculateSpansDecrementalArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

    @Test
    public void calculateSpansMixedArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{3, 4, 2, 5, 1});
        assertArrayEquals(new int[]{1, 2, 1, 4, 1}, result);
    }

}