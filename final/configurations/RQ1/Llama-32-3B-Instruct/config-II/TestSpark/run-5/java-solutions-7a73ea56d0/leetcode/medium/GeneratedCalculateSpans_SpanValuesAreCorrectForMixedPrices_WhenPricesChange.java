package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SpanValuesAreCorrectForMixedPrices_WhenPricesChange {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SpanValuesAreCorrectForMixedPrices_WhenPricesChange() {
        int[] prices = {100, 80, 75, 70, 60};
        int[] expectedSpans = {1, 2, 3, 4, 5};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, actualSpans);
    }

}