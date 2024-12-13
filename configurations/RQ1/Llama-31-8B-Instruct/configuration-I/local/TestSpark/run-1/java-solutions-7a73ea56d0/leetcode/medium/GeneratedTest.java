package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void next_SinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        int actual = stockSpan.next(price);
        assertEquals(expected, actual);
    }

    @Test
    public void next_IncreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        for (int price : prices) {
            int expected = 1;
            int actual = stockSpan.next(price);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void next_DecreasingPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10};
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int expected = i + 1;
            int actual = stockSpan.next(price);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void next_MixedPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {50, 40, 30, 20, 10, 15, 25, 35, 45, 55};
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int expected = i + 1;
            int actual = stockSpan.next(price);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void calculateSpans_EmptyArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int[] actual = stockSpan.calculateSpans(prices);
        assertArrayEquals(expected, actual);
    }

}