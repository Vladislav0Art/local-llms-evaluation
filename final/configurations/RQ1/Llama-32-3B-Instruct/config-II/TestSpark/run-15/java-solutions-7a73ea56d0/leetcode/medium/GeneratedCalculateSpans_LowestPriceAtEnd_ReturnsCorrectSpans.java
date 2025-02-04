package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_LowestPriceAtEnd_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_LowestPriceAtEnd_ReturnsCorrectSpans() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {10, 5, 8};
        int[] result = obj.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}