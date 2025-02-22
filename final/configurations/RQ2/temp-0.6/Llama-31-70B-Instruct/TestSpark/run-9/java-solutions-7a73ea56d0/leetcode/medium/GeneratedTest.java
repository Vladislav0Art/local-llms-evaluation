package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(100));
    }

    @Test
    public void calculateSpansTest1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] expectedSpans = {1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100, 100, 100};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}