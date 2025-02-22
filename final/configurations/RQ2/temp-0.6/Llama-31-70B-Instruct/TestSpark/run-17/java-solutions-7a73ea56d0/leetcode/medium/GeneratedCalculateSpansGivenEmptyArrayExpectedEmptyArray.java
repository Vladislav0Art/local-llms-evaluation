package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansGivenEmptyArrayExpectedEmptyArray {

    @Test
    public void calculateSpansGivenEmptyArrayExpectedEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

}