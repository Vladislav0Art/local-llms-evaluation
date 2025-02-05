package leetcode.medium;

import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedCalculateSpansOrderedAscendingTest {

    @Test
    public void calculateSpansOrderedAscendingTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{10, 20, 30, 40, 50});
        int[] expected = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

}