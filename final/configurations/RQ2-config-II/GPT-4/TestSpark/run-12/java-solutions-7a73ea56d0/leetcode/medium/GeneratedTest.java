package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextPriceLowerThanPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(80);
        assertEquals(1, result);
    }

    @Test
    public void nextPriceEqualtoPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(100);
        assertEquals(2, result);
    }

    @Test
    public void nextPriceHigherThanAllPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(200);
        int result = span.next(300);
        assertEquals(3, result);
    }

    @Test
    public void nextPriceLowerThanAllPreviousTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        span.next(200);
        int result = span.next(50);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansOrderedAscendingTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{10, 20, 30, 40, 50});
        int[] expected = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void calculateSpansOrderedDescendingTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{50, 40, 30, 20, 10});
        int[] expected = new int[]{1, 1, 1, 1, 1};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void calculateSpansUnorderedTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}