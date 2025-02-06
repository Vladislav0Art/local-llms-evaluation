package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleElementsInput_ReturnsCorrectValues {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsInput_ReturnsCorrectValues() {
        int[] prices = {10, 20, 30, 40, 50};
        int[] result = underTest.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}