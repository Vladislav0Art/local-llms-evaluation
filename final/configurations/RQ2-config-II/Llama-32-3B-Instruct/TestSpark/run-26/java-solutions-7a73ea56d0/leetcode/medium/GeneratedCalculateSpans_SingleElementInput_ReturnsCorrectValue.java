package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementInput_ReturnsCorrectValue {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementInput_ReturnsCorrectValue() {
        int[] prices = {100};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}