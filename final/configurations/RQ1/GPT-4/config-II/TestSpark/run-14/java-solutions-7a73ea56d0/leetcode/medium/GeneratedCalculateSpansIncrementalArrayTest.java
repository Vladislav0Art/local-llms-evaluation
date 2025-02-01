package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncrementalArrayTest {

    @Test
    public void calculateSpansIncrementalArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

}