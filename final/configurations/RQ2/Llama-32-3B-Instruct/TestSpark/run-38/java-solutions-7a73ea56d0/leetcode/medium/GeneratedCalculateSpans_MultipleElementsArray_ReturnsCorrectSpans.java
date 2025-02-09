package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}