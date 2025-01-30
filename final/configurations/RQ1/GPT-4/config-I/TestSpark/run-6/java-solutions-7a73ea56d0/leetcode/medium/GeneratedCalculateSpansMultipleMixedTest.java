package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleMixedTest {

    @Test
    public void calculateSpansMultipleMixedTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = {100, 120, 110, 140, 130};
        int[] expectedOutput = {1, 2, 1, 4, 1};
        assertArrayEquals(expectedOutput, onlineStockSpan.calculateSpans(input));
    }

}