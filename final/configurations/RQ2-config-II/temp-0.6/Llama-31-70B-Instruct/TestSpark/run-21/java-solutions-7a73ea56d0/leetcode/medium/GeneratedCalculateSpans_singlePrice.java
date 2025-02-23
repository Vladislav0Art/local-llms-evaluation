package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_singlePrice {

    @Test
    public void calculateSpans_singlePrice() {
        int[] prices = {10};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, spans);
    }

}