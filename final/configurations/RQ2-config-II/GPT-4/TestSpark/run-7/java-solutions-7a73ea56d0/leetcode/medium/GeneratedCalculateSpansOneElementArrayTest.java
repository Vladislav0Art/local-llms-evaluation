package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansOneElementArrayTest {

    @Test
    public void calculateSpansOneElementArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

        int[] spans = onlineStockSpan.calculateSpans(new int[]{20});

        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

}