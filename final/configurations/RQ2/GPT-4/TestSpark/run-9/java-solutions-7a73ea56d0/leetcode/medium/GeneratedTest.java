package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(80);
        assertEquals(1, result);
    }

    @Test
    public void nextMultiplePricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(110);
        int result = onlineStockSpan.next(120);
        assertEquals(3, result);
    }

    @Test
    public void nextZeroPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(0);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansEmptyTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansMultiplePricesSameTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 100, 100});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void calculateSpansMultiplePricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 110, 120});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void calculateSpansMultiplePricesDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{120, 110, 100});
        assertArrayEquals(new int[]{1, 1, 1}, result);
    }

    @Test
    public void calculateSpansMultiplePricesMixedTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 110, 100, 120, 110});
        assertArrayEquals(new int[]{1, 2, 1, 4, 1}, result);
    }

}