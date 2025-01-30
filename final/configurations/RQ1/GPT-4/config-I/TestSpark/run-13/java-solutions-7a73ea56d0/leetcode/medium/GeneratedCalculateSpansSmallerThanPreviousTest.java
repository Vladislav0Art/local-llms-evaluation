package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSmallerThanPreviousTest {

    @Test
    public void calculateSpansSmallerThanPreviousTest() {
        OnlineStockSpan spanner = new OnlineStockSpan();
        int[] spans = spanner.calculateSpans(new int[]{110, 100, 90});
        assertArrayEquals(new int[]{1, 1, 1}, spans);
    }

}