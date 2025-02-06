package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void nextLowestPriceNoSpan() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(100));
    }

    @Test
    public void nextHighestPriceWithSpan() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(2, stock.next(100));
        assertEquals(1, stock.next(80));
    }

    @Test
    public void nextConsecutivePricesNoChange() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(100));
        assertEquals(1, stock.next(100));
    }

    @Test
    public void nextConsecutivePricesIncrease() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(2, stock.next(100));
        assertEquals(3, stock.next(105));
        assertEquals(4, stock.next(110));
    }

    @Test
    public void calculateSpansNoInput() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{});
        assertEquals(new int[]{0}, result);
    }

    @Test
    public void calculateSpansEmptyArray() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{100, 105, 110});
        assertEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void calculateSpansOneElement() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{100});
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansMultipleElements() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10, 7, 5, 8, 11, 9});
        assertEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

}