package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertEquals(1, result);
    }

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        assertEquals(1, stockSpan.next(100));
        assertEquals(2, stockSpan.next(120));
        assertEquals(1, stockSpan.next(90));
        assertEquals(1, stockSpan.next(70));
        assertEquals(2, stockSpan.next(110));
    }

    @Test
    public void nextNegativePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            stockSpan.next(-100);
        } catch (IllegalArgumentException e) {
            assertEquals("Price should not be negative.", e.getMessage());
        }
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {};
        int[] result = stockSpan.calculateSpans(input);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansNonEmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpan.calculateSpans(input);
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, result);
    }

    @Test
    public void calculateSpansWithNegativePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100, 80, 60, -70, 60, 75, 85};
        try {
            stockSpan.calculateSpans(input);
        } catch (IllegalArgumentException e) {
            assertEquals("Price should not be negative.", e.getMessage());
        }
    }

}