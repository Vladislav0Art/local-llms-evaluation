package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}