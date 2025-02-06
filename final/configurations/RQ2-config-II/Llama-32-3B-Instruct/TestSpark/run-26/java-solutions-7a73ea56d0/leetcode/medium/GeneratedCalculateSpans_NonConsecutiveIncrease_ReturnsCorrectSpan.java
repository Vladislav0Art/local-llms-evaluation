package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_NonConsecutiveIncrease_ReturnsCorrectSpan {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_NonConsecutiveIncrease_ReturnsCorrectSpan() {
        int[] prices = {10, 40, 30, 50};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 5}, result);
    }

}