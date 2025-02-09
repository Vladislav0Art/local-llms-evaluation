package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansZeroValuesTest {

    @Test
    public void calculateSpansZeroValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{0, 0, 0});
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}