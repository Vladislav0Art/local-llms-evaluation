package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementArrayTest {

    // Test next method

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, spans);
    }

}