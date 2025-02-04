package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        int[] prices = {10, 5, 8};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 3, 4}, result);
    }

}