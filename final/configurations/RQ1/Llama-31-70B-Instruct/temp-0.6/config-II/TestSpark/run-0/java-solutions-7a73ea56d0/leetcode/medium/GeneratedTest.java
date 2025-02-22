package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(10));
        assertEquals(2, stock.next(20));
        assertEquals(1, stock.next(5));
        assertEquals(6, stock.next(70));
        assertEquals(4, stock.next(60));
        assertEquals(1, stock.next(20));
        assertEquals(1, stock.next(15));
    }

    @Test
    public void calculateSpansTest1() {
        int[] prices = new int[]{10, 20, 5, 70, 60, 20, 15};
        int[] expected = new int[]{1, 2, 1, 6, 4, 1, 1};

        OnlineStockSpan stock = new OnlineStockSpan();
        int[] actual = stock.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void calculateSpansTest2() {
        int[] prices = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 1, 1, 1, 1};

        OnlineStockSpan stock = new OnlineStockSpan();
        int[] actual = stock.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}