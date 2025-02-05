package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleValueTest {

    @Test
    public void calculateSpansSingleValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100});
        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

}