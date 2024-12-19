package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_TwoElements_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_TwoElements_ReturnsCorrectSpans() {
        int[] prices = {2, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{3, 2}, result);
    }

}