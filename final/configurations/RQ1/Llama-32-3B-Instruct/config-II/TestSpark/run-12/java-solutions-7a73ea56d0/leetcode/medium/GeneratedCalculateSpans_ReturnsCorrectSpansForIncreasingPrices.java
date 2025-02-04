package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForIncreasingPrices {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_ReturnsCorrectSpansForIncreasingPrices() {
        int[] prices = {100, 80, 70, 60};
        int[] expectedSpans = new int[]{1, 2, 3, 4};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, stockSpan.list.toArray());
    }

}