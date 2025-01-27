package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansWithZeroPriceTest {

    @Test
    public void calculateSpansWithZeroPriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[]{0});
        assertEquals(new int[]{1}, result);
    }

}