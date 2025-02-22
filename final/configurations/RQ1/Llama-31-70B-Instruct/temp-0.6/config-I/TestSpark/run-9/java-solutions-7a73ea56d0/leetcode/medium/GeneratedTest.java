package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextEmptyListTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(10);
        assertEquals(1, result);
    }

    @Test
    public void nextWithoutDuplicatesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        int result = stockSpan.next(40);
        assertEquals(4, result);
    }

    @Test
    public void nextWithDuplicatesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(10);
        stockSpan.next(10);
        int result = stockSpan.next(10);
        assertEquals(4, result);
    }

    @Test
    public void calculateSpansEmptyListTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}