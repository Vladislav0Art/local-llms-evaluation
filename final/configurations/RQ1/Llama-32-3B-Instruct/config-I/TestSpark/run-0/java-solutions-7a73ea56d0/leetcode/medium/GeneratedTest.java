package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[0]);
        assertArrayEquals(result, new int[0]);
    }

    @Test
    public void next_PriceLessThanFirstPrice_CountIsZero() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(0, stock.next(10));
    }

    @Test
    public void next_PriceEqualToFirstPrice_CountIsOne() {
        OnlineStockSpan stock = new OnlineStockSpan();
        assertEquals(1, stock.next(10));
    }

    @Test
    public void next_PriceGreaterThanFirstPrice_CountIsTwo() {
        OnlineStockSpan stock = new OnlineStockSpan();
        stock.next(10);
        stock.next(20);
        assertEquals(2, stock.next(10));
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10, 20, 30});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

    @Test
    public void calculateSpans_PriceDecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{30, 20, 10});
        assertArrayEquals(new int[]{3, 2, 1}, result);
    }

    @Test
    public void calculateSpans_PriceIncreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{10, 20, 30});
        assertArrayEquals(new int[]{3, 2, 1}, result);
    }

    @Test
    public void calculateSpans_StackEmptied_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            stock.next(i);
        }
        int[] result = stock.calculateSpans(new int[]{});
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void calculateSpans_StackEmptyAtBeginning_ReturnsCorrectSpans() {
        OnlineStockSpan stock = new OnlineStockSpan();
        for (int i = 10; i >= 1; i--) {
            stock.next(i);
        }
        int[] result = stock.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{10}, result);
    }

}