package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTest {

    @Test
    public void testNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(20));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(15));
        assertEquals(2, stockSpan.next(25));
        assertEquals(3, stockSpan.next(20));
        assertEquals(1, stockSpan.next(30));
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{10, 4, 5, 90, 120, 80};
        int[] expectedSpans = new int[]{1, 1, 2, 4, 5, 1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}