package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansDecreasingOrderArrayTest {

    @Test
    public void calculateSpansDecreasingOrderArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{130, 120, 100});
        assertArrayEquals(new int[]{1, 1, 1}, spans);
    }

}