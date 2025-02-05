package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithSingleElementTest {

    @Test
    public void calculateSpansWithSingleElementTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[]{100});
        assertEquals(1, spans.length);
        assertEquals(1, spans[0]);
    }

}