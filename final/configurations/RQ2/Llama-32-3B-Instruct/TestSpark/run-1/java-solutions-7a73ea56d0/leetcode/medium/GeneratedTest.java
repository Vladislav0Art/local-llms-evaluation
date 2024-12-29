package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void calculateSpans_EqualPrices_ReturnsEqualSpans() {
        int[] prices = {100, 80, 75, 70, 60};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int price : prices) {
            onlineStockSpan.next(price);
        }

        int[] expectedSpans = {1, 1, 2, 3, 4};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpans_IncreasingPrices_ReturnsIncreasingSpans() {
        int[] prices = {10, 20, 30, 40};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int price : prices) {
            onlineStockSpan.next(price);
        }

        int[] expectedSpans = {1, 2, 3, 4};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void calculateSpans_IncreasingPricesWithGap_ReturnsIncreasingSpans() {
        int[] prices = {10, 30, 50, 60};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int price : prices) {
            onlineStockSpan.next(price);
        }

        int[] expectedSpans = {1, 3, 2, 3};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(expectedSpans, actualSpans);
    }

    @Test
    public void next_InvalidPrice_ThrowsNoException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (Object price : Arrays.asList(0, -100)) {
            if (price instanceof Integer) {
                onlineStockSpan.next((int) price);
            }
        }
    }

    @Test
    public void next_InvalidPrice_ThrowsException() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (Object price : Arrays.asList(Double.NaN, -100)) {
            if (price instanceof Integer) {
                onlineStockSpan.next((int) price);
            }
        }
    }

    @Test
    public void calculateSpans_EmptyPrices_ReturnsEmptySpans() {
        int[] prices = {};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[0], actualSpans);
    }

}