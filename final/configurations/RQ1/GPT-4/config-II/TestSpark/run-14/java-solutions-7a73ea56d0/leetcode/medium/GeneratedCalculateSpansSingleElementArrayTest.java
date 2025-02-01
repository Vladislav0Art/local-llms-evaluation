package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementArrayTest {

    @Test
    public void calculateSpansSingleElementArrayTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] result = span.calculateSpans(new int[]{25});
        assertArrayEquals(new int[]{1}, result);
    }

}