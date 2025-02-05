package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansUnorderedTest {

    @Test
    public void calculateSpansUnorderedTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{100, 80, 60, 70, 60, 75, 85});
        int[] expected = new int[]{1, 1, 1, 2, 1, 4, 6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}