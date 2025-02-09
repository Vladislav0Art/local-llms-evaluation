package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMultipleValuesTest {

    @Test
    public void calculateSpansMultipleValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{100, 80, 120});
        assertArrayEquals(new int[]{1, 1, 3}, result);
    }

}