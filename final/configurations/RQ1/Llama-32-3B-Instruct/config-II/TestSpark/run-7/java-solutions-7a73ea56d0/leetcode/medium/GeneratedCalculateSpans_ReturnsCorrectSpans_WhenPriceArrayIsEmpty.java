package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCalculateSpans_ReturnsCorrectSpans_WhenPriceArrayIsEmpty {

    @Test
    public void calculateSpans_ReturnsCorrectSpans_WhenPriceArrayIsEmpty() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}