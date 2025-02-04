package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_TwoElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_TwoElements_ReturnsCorrectSpans() {
        OnlineStockSpan obj = new OnlineStockSpan();
        int[] prices = {80, 70};
        int[] result = obj.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2}, result);
    }

}