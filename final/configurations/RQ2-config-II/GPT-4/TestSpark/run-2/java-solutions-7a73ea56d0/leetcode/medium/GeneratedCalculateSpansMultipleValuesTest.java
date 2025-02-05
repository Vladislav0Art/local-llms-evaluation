package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleValuesTest {

    @Test
    public void calculateSpansMultipleValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] spans = onlineStockSpan.calculateSpans(new int[]{100, 110, 90, 110});
        assertEquals(4, spans.length);
        assertArrayEquals(new int[]{1, 2, 1, 3}, spans);
    }

}