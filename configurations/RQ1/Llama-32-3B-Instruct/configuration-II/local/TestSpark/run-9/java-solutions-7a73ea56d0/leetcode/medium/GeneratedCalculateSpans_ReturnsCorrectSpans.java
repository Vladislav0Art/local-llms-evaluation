package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70};
        int[] expectedSpans = {1, 2, 4, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertEquals(expectedSpans[i], actualSpans[i]);
        }
    }

}