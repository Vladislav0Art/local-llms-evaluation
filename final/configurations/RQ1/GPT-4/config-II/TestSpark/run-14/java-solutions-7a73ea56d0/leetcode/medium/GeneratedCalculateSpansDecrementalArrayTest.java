package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecrementalArrayTest {

    @Test
    public void calculateSpansDecrementalArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{5, 4, 3, 2, 1});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, result);
    }

}