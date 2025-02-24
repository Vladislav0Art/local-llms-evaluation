package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextTest_priceGreaterThanPrevious() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(1);
        int actual = stock.next(2);
        assertEquals(2, actual);
    }

    @Test
    public void nextTest_priceLessThanPrevious() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(2);
        int actual = stock.next(1);
        assertEquals(1, actual);
    }

    @Test
    public void calculateSpansTest_oneElement() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1};
        int[] actual = stock.calculateSpans(prices);
        assertEquals(1, actual.length);
        assertEquals(1, actual[0]);
    }

}