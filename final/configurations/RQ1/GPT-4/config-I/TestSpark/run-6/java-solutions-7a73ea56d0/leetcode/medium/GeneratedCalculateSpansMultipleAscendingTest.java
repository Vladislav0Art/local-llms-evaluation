package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleAscendingTest {

    @Test
    public void calculateSpansMultipleAscendingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = {100, 110, 120};
        int[] expectedOutput = {1, 2, 3};
        assertArrayEquals(expectedOutput, onlineStockSpan.calculateSpans(input));
    }

}