package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextNoPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(100));
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        assertEquals(1, onlineStockSpan.next(120));
    }

    @Test
    public void nextOneLowerPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(80);
        assertEquals(2, onlineStockSpan.next(80));
    }

    @Test
    public void calculateSpansNoPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{};
        int[] expected = new int[]{};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansOnePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{85};
        int[] expected = new int[]{1};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}