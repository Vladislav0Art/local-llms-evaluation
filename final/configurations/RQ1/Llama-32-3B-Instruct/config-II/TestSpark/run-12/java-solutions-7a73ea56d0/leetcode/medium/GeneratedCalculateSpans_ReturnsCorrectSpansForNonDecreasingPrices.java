package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForNonDecreasingPrices {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_ReturnsCorrectSpansForNonDecreasingPrices() {
        int[] prices = {100, 110, 90, 80};
        int[] expectedSpans = new int[]{2, 1, 3, 4};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, stockSpan.list.toArray());
    }

}