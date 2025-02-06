package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SinglePriceArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_SinglePriceArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{10});
        assertEquals(new int[]{1}, result);
    }

}