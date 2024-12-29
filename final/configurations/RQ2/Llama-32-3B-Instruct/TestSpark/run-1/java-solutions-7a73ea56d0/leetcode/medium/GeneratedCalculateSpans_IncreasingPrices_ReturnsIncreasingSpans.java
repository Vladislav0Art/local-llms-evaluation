package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_IncreasingPrices_ReturnsIncreasingSpans {

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

}