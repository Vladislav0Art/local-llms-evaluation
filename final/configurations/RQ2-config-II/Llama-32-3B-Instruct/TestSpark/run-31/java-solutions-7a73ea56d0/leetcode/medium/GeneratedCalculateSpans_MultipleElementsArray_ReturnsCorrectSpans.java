package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 95};
        int[] result = solution.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(1, result[2]);
        assertEquals(4, result[3]);
        assertEquals(1, result[4]);
    }

}