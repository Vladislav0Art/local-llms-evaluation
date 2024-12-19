package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {1, 2, 3, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 2, 2, 2}, result);
    }

}