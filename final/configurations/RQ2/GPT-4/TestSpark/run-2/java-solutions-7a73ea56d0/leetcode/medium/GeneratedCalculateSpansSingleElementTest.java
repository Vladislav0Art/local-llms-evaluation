package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] input = {100};
        int[] expected = {1};
        assertArrayEquals(expected, stockSpan.calculateSpans(input));
    }

}