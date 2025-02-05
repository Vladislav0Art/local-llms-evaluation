package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansIncreasingOrderArrayTest {

    @Test
    public void calculateSpansIncreasingOrderArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{100, 120, 130});
        assertArrayEquals(new int[]{1, 2, 3}, spans);
    }

}