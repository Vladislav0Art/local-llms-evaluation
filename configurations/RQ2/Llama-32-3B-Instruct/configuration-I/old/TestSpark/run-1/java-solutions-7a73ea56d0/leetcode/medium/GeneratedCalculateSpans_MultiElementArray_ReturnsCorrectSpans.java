package leetcode.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultiElementArray_ReturnsCorrectSpans {

    @Before
    public void setup() {
        // Do nothing as per the requirements
    }

    @Test
    public void calculateSpans_MultiElementArray_ReturnsCorrectSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }

}