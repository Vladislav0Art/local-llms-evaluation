package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SamePrices_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SamePrices_ReturnsCorrectSpans() {
        int[] prices = {100, 100, 100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{3, 2, 2}, result);
    }

}