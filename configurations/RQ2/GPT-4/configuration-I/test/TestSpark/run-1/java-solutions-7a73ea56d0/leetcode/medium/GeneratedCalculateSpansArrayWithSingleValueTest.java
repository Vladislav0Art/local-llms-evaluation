package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCalculateSpansArrayWithSingleValueTest {

    @Test
    public void calculateSpansArrayWithSingleValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{27});
        assertArrayEquals(new int[]{1}, result);
    }

}