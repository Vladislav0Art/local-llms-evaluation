package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, spans);
    }

}