package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void next_WhenPriceIsLessThanAllPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(70);
        onlineStockSpan.next(60);

        assertEquals(4, onlineStockSpan.list.get(0));
    }

    @Test
    public void next_WhenPriceIsEqualToAllPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(70);
        onlineStockSpan.next(60);

        assertEquals(4, onlineStockSpan.list.get(1));
    }

    @Test
    public void next_WhenPriceIsGreaterThenAllPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        onlineStockSpan.next(70);

        assertEquals(3, onlineStockSpan.list.get(2));
    }

    @Test
    public void next_WhenNoPreviousPrices_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);

        assertEquals(1, onlineStockSpan.list.get(0));
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_MultipleElementArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 70, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);

        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void calculateSpans_NullArray_ThrowsNullPointerException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        try {
            onlineStockSpan.calculateSpans(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}