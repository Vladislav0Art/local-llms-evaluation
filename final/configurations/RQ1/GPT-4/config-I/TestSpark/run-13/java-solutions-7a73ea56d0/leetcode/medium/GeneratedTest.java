package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextFirstElementTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        assertEquals(1, spanner.next(100));
    }

    @Test
    public void nextSmallerThanPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        assertEquals(1, spanner.next(80));
    }

    @Test
    public void nextGreaterThanAllPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        spanner.next(80);
        assertEquals(3, spanner.next(125));
    }

    @Test
    public void nextEqualToPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        spanner.next(100);
        spanner.next(100);
        assertEquals(3, spanner.next(100));
    }

    @Test
    public void calculateSpansFirstElementTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, spans);
    }

    @Test
    public void calculateSpansSmallerThanPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{110, 100, 90});
        assertArrayEquals(new int[]{1, 1, 1}, spans);
    }

    @Test
    public void calculateSpansGreaterThanAllPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 110, 120});
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

    @Test
    public void calculateSpansEqualToPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 100, 100});
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

    @Test
    public void calculateSpansMixedValuesTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 80, 90, 120, 110, 75});
        assertArrayEquals(new int[]{1, 1, 2, 4, 1, 1}, spans);
    }

}