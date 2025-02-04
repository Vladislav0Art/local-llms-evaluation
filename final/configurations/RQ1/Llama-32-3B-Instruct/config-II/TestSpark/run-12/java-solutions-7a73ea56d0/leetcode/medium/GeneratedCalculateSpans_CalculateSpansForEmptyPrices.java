package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_CalculateSpansForEmptyPrices {

    private List<Integer> list = new ArrayList<>();

    @Test
    public void calculateSpans_CalculateSpansForEmptyPrices() {
        int[] prices = {};
        int[] expectedSpans = {0};
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, stockSpan.list.toArray());
    }

}