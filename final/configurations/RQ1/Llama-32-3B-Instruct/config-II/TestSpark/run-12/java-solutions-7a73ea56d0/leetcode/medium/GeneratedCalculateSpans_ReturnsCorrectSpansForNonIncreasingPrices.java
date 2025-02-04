package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectSpansForNonIncreasingPrices {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_ReturnsCorrectSpansForNonIncreasingPrices() {
        int[] prices = {100, 90, 80, 70};
        int[] expectedSpans = new int[]{1, 3, 5, 6};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, stockSpan.list.toArray());
    }

}