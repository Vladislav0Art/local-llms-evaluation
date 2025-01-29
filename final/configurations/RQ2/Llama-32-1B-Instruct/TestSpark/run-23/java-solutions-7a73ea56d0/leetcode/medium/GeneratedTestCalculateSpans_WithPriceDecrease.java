package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSpans_WithPriceDecrease {

    public int next(int price) {
        return (price - 1000) / 500;
    }

    @Test
    public void testCalculateSpans_WithPriceDecrease() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 900, 800};
        int[] expected1 = {2, 4, 6};
        assertArrayEquals(expected1, calculateSpans(prices1));
    }

}