package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectValues {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectValues() {
        int[] prices = {10, 8, 9, 7};
        int[] result = OnlineStockSpan().calculateSpans(prices);
        assertTrue(result.length == 4);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(1, result[3]);
    }

}