package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_NonConsecutiveDecrease_ReturnsCorrectSpan {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_NonConsecutiveDecrease_ReturnsCorrectSpan() {
        int[] prices = {10, 40, 30, 20};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 3, 2, 4}, result);
    }

}