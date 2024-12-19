package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectSpan {

    @Before
    public void setup() {
        // Do nothing as per the requirements
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}