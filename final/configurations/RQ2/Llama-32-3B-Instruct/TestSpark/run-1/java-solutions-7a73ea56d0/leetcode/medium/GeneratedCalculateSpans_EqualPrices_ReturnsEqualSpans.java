package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_EqualPrices_ReturnsEqualSpans {

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

}