package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithEmptyInputTest {

    @Test
    public void calculateSpansWithEmptyInputTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] spans = stockSpan.calculateSpans(new int[0]);
        assertEquals(0, spans.length);
    }

}