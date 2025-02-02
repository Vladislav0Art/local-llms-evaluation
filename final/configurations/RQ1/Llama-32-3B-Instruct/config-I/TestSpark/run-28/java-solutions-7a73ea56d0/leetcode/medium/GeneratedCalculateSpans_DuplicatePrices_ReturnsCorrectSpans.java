package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_DuplicatePrices_ReturnsCorrectSpans {

    private final OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_DuplicatePrices_ReturnsCorrectSpans() {
        int[] prices = {100, 70, 50, 80, 60};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 1, 3, 2}, result);
    }

}