package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_DecreasingSequence_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_DecreasingSequence_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {60, 50, 40, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

}