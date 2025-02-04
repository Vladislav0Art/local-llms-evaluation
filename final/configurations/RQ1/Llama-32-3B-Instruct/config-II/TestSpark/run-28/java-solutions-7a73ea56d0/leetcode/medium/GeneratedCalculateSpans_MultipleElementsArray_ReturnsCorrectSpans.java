package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        int[] prices = {50, 60, 70};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 1, 1}, result);
    }

}