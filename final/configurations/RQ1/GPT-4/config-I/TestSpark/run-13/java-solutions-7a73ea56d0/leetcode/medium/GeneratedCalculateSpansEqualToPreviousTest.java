package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEqualToPreviousTest {

    @Test
    public void calculateSpansEqualToPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{100, 100, 100});
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

}