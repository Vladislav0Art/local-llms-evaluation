package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleElementArrayTest {

    // Test next method

    @Test
    public void calculateSpansMultipleElementArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{100, 180, 260, 310, 40, 535, 695});
        assertArrayEquals(new int[]{1, 2, 3, 4, 1, 2, 3}, spans);
    }

}