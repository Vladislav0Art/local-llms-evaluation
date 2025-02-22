package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansGivenTwoElementsArrayExpectedOneAndTwo {

    @Test
    public void calculateSpansGivenTwoElementsArrayExpectedOneAndTwo() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10, 20});
        assertArrayEquals(new int[]{1, 2}, result);
    }

}