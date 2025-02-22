package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTestWithoutDuplicates() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(1, stockSpan.next(2));
        assertEquals(1, stockSpan.next(3));
    }

    @Test
    public void nextTestWithDuplicates() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(2, stockSpan.next(1));
        assertEquals(3, stockSpan.next(1));
    }

    @Test
    public void calculateSpansTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3};
        int[] expectedSpans = {1, 2, 3};
        assertArrayEquals(expectedSpans, stockSpan.calculateSpans(prices));
    }

}