package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_WhenPriceIsLessThanPreviousReturnsCorrectSpan {

    @Test
    public void calculateSpans_WhenPriceIsLessThanPreviousReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70};
        int[] expectedSpans = {1, 2, 4, 6};
        int[] actualSpans = onlineStockSpan.calculateSpans(prices);
        assertEquals(4, actualSpans[0]);
        assertEquals(2, actualSpans[1]);
        assertEquals(4, actualSpans[2]);
        assertEquals(6, actualSpans[3]);
    }

}