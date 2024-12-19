package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementReturnsOne {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementReturnsOne() {
        int[] prices = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}