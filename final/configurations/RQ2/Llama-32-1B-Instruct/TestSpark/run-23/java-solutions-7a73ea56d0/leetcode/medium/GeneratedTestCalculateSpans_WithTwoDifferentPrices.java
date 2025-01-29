package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSpans_WithTwoDifferentPrices {

    public int next(int price) {
        return (price - 1000) / 500;
    }

    @Test
    public void testCalculateSpans_WithTwoDifferentPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 2000};
        int[] expected1 = {3, 4};
        assertArrayEquals(expected1, calculateSpans(prices1));
    }

    public List<Integer> priceStack;

    @Override
    public String toString() {
        return "priceStack=" + priceStack;
    }

}