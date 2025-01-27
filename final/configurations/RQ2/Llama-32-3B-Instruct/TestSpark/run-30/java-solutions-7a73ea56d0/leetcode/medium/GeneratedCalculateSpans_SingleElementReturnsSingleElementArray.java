package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementReturnsSingleElementArray {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementReturnsSingleElementArray() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(100, result[0]);
    }

}