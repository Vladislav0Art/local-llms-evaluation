package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SpanValuesAreCorrectForAllPrices {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SpanValuesAreCorrectForAllPrices() {
        int[] prices = {100, 80, 75, 70, 60, 65};
        int[] expectedSpans = {1, 2, 3, 4, 5, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}