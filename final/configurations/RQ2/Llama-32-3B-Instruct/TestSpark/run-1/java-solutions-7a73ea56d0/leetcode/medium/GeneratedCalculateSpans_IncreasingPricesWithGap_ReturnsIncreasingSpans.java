package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_IncreasingPricesWithGap_ReturnsIncreasingSpans {

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

}