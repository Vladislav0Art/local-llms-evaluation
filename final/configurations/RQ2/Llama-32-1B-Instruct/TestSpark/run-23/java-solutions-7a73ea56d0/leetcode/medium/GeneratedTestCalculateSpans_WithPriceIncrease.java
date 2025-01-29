package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSpans_WithPriceIncrease {

    public int next(int price) {
        return (price - 1000) / 500;
    }

    @Test
    public void testCalculateSpans_WithPriceIncrease() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 1100, 1200};
        int[] expected1 = {3, 5, 7};
        assertArrayEquals(expected1, calculateSpans(prices1));
    }

}