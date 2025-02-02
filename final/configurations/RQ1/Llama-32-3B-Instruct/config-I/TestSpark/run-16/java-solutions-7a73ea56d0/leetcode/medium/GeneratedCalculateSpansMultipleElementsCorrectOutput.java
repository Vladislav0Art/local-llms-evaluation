package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansMultipleElementsCorrectOutput {

    @Test
    public void calculateSpansMultipleElementsCorrectOutput() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {100, 80, 70};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{2, 1, 1}, result);
    }

}