package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleElementsTest {

    @Test
    public void calculateSpansMultipleElementsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100, 80, 60, 70, 60};
        int[] expected = {1, 1, 1, 2, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(input));
    }

}