package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleValueTest {

    @Test
    public void calculateSpansSingleValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100});
        assertArrayEquals(new int[]{1}, result);
    }

}