package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansSinglePriceTest {

    @Test
    public void calculateSpansSinglePriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{1});
        assertEquals(1, result[0]);
    }

}