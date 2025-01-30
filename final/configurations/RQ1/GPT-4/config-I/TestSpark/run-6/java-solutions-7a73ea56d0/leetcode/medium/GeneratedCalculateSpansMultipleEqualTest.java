package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleEqualTest {

    @Test
    public void calculateSpansMultipleEqualTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = {100, 100, 100, 100, 100};
        int[] expectedOutput = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedOutput, onlineStockSpan.calculateSpans(input));
    }

}