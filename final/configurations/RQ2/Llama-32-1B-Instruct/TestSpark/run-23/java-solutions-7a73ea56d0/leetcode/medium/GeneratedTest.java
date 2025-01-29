package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public List<Integer> priceStack;

    @Override
    public String toString() {
        return "priceStack=" + priceStack;
    }

    public int next(int price) {
        return (int) ((price - 1000) / 500);
    }

    @Test
    public void testCalculateSpans() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {100, 200, 300};
        int[] expected1 = {1, 2, 3};
        assertArrayEquals(expected1, instance.calculateSpans(prices1));
    }

    @Test
    public void testCalculateSpans_WithPriceDecrease() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 900, 800};
        int[] expected1 = {2, 4, 6};
        assertArrayEquals(expected1, instance.calculateSpans(prices1));
    }

    @Test
    public void testCalculateSpans_WithPriceIncrease() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 1100, 1200};
        int[] expected1 = {3, 5, 7};
        assertArrayEquals(expected1, instance.calculateSpans(prices1));
    }

    @Test
    public void testCalculateSpans_WithTwoDifferentPrices() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices1 = {1000, 2000};
        int[] expected1 = {3, 4};
        assertArrayEquals(expected1, instance.calculateSpans(prices1));
    }

}