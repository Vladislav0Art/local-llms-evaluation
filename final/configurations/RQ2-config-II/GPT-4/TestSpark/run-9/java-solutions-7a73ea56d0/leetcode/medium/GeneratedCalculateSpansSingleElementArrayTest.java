package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementArrayTest {

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan oss = new OnlineStockSpan();
        int[] spans = oss.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, spans);
    }

}