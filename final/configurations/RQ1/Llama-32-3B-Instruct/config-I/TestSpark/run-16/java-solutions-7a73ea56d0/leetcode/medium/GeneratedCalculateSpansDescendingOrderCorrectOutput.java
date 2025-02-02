package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansDescendingOrderCorrectOutput {

    @Test
    public void calculateSpansDescendingOrderCorrectOutput() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{3, 2, 1}, result);
    }

}