package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElement_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElement_ReturnsCorrectSpan() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = obj.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}