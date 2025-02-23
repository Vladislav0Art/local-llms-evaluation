package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void nextSmallPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 2;

        int expected = 1;
        int result = stockSpan.next(price);

        assertEquals(expected, result);
    }

    @Test
    public void nextBigPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 10;

        int expected = 1;
        int result = stockSpan.next(price);

        assertEquals(expected, result);
    }

    @Test
    public void calculateSpansValidPricesTest() {
        int[] prices = {10, 20, 30, 40};

        int[] expected = {1, 1, 1, 1};
        int[] result = OnlineStockSpan.calculateSpans(prices);

        assertArrayEquals(expected, result);
    }

    @Test
    public void calculateSpansInvalidPricesTest() {
        int[] prices = {0, -1, 1, 2};

        int[] expected = {1, 1, 1, 1};
        int[] result = OnlineStockSpan.calculateSpans(prices);

        assertArrayEquals(expected, result);
    }

}