package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpansEmptyArray returnsCorrectOutput {

    @Test
    public void calculateSpansEmptyArray

    returnsCorrectOutput() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{0}, result);
    }

}