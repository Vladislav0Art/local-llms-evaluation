package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElement_ReturnsCorrectSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElement_ReturnsCorrectSpan() {
        int[] prices = {10};
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}