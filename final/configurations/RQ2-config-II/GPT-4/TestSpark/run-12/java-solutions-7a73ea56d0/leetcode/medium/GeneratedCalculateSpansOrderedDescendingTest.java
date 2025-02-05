package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansOrderedDescendingTest {

    @Test
    public void calculateSpansOrderedDescendingTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{50, 40, 30, 20, 10});
        int[] expected = new int[]{1, 1, 1, 1, 1};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}