package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpansNoInput {

    @Test
    public void calculateSpansNoInput() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] result = stock.calculateSpans(new int[]{});
        assertEquals(new int[]{0}, result);
    }

}