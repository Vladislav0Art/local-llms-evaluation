package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultiElementArray_ReturnsCorrectSpansAndCumulativeSum {

    @Before
    public void setup() {
        // Do nothing as per the requirements
    }

    @Test
    public void calculateSpans_MultiElementArray_ReturnsCorrectSpansAndCumulativeSum() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
        assertEquals(5, result[2]);
    }

}