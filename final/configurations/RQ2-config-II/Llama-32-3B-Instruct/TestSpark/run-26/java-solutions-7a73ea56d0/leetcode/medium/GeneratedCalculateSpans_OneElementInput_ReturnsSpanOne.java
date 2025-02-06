package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_OneElementInput_ReturnsSpanOne {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void calculateSpans_OneElementInput_ReturnsSpanOne() {
        int[] prices = {1};
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}