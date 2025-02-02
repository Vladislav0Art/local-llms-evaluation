package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_DuplicateElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DuplicateElements_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 30, 30, 40};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
        assertEquals(1, result[3]);
    }

}