package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class GeneratedCalculateSpans_MultipleElementsTest {

    @Test
    public void calculateSpans_MultipleElementsTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 7, 2};
        int[] expected = {1, 1, 2, 3, 4};
        assertArrayEquals(expected, solution.calculateSpans(prices));
    }

}