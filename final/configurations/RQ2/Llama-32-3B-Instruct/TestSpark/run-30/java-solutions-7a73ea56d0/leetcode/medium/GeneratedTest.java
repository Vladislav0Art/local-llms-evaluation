package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void next_DivisibleByZero_ThrowsException() {
        assertThrows(Exception.class, () -> onlineStockSpan.next(0));
    }

    @Test
    public void next_NoDividend_ReturnsOne() {
        int price = 1;
        assertEquals(1, onlineStockSpan.next(price));
    }

    @Test
    public void next_DivisibleByPreviousDividend_ReturnsIncreaseInDaySpan() {
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(90));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue(result.length == 0);
    }

    @Test
    public void calculateSpans_SingleElementReturnsSingleElementArray() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(100, result[0]);
    }

    @Test
    public void next_MultipleElementsPrices_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30});
        assertEquals(3, result.length);
        assertTrue(result[0] == 1 && result[1] == 2 && result[2] == 3);
    }

    @Test
    public void next_ShortPricesArray_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        int[] result = onlineStockSpan.calculateSpans(new int[]{30, 20});
        assertEquals(2, result.length);
        assertTrue(result[0] == 1 && result[1] == 2);
    }

    @Test
    public void next_SpanIncreasingPrices_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(15);
        onlineStockSpan.next(20);
        int[] result = onlineStockSpan.calculateSpans(new int[]{15, 20});
        assertEquals(2, result.length);
        assertTrue(result[0] == 1 && result[1] == 2);
    }

    @Test
    public void next_SpanDecreasingPrices_ReturnsCorrectResult() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(5);
        int[] result = onlineStockSpan.calculateSpans(new int[]{15, 20});
        assertEquals(2, result.length);
        assertTrue(result[0] == 1 && result[1] == 2);
    }

    @Test
    public void next_LargePricesArray_ReturnsCorrectResult() {
        onlineStockSpan.next(10000);
        onlineStockSpan.next(5000);
        onlineStockSpan.next(20000);
        int[] result = onlineStockSpan.calculateSpans(new int[]{10000, 5000});
        assertEquals(3, result.length);
        assertTrue(result[0] == 1 && result[1] == 2 && result[2] == 3);
    }

}