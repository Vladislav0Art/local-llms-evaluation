package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleElementsArrayTest {

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{100, 80, 120, 130});
        assertArrayEquals(new int[]{1, 1, 2, 3}, spans);
    }

}