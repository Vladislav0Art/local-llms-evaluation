package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextSinglePriceTest() {
        int price = 100;
        assertEquals(1, onlineStockSpan.next(price));
    }

    @Test
    public void nextMultiplePricesTest() {
        int[] prices = {100, 80, 75, 90};
        for (int i = 0; i < prices.length; i++) {
            if (i == 0) {
                assertEquals(1, onlineStockSpan.next(prices[i]));
            } else {
                assertEquals(i + 1, onlineStockSpan.next(prices[i]));
            }
        }
    }

    @Test
    public void calculateSpansEmptyArrayTest() {
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

    @Test
    public void calculateSpansSinglePriceTest() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpansMultiplePricesTest() {
        int[] prices = {100, 80, 75, 90, 70, 60, 50};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, result);
    }

    @Test
    public void calculateSpansIncreasingPricesTest() {
        int[] prices = {100, 120, 150, 180};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void calculateSpansDecreasingPricesTest() {
        int[] prices = {100, 80, 75, 90};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

}