package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleDescendingTest {

    @Test
    public void calculateSpansMultipleDescendingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = {120, 110, 100};
        int[] expectedOutput = {1, 1, 1};
        assertArrayEquals(expectedOutput, onlineStockSpan.calculateSpans(input));
    }

}