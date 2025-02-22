package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansGivenOneElementArrayExpectedOne {

    @Test
    public void calculateSpansGivenOneElementArrayExpectedOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}