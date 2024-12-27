package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextInputPriceSingleValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(17);
        assertEquals(1, result);
    }

    @Test
    public void nextInputPriceInIncreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(21);
        assertEquals(1, result);
    }

    @Test
    public void nextInputPriceInDecreasingOrderTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(19);
        assertEquals(1, result);
    }

    @Test
    public void nextInputPriceSameValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(20);
        assertEquals(1, result);
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpansArrayWithSingleValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{27});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansArrayWithMultipleValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 75, 85, 70, 80, 100});
        assertArrayEquals(new int[]{1, 1, 2, 1, 2, 5}, result);
    }

    @Test
    public void calculateSpansArrayWithAllSameValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{50, 50, 50, 50});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

}