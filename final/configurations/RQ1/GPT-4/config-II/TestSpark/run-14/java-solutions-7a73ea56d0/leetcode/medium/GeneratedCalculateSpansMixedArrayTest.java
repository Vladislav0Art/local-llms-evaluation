package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMixedArrayTest {

    @Test
    public void calculateSpansMixedArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{3, 4, 2, 5, 1});
        assertArrayEquals(new int[]{1, 2, 1, 4, 1}, result);
    }

}