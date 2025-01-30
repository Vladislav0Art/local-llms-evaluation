package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleTest {

    @Test
    public void calculateSpansSingleTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] input = {100};
        int[] expectedOutput = {1};
        assertArrayEquals(expectedOutput, onlineStockSpan.calculateSpans(input));
    }

}